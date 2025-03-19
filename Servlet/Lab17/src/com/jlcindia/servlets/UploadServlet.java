package com.jlcindia.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.DiskFileUpload;


public class UploadServlet extends HttpServlet {
	private File tmpDir;
	private File destinationDir;
	
	public void init(ServletConfig config) throws ServletException {
		tmpDir=new File(System.getProperty("java.io.tmpdir"));
		String realPath=config.getServletContext().getRealPath("/uploaded");
		System.out.println(realPath);
		destinationDir=new File(realPath);
		if(!destinationDir.exists()){
			destinationDir.mkdir();
		}
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.write("<h1>Servlet File Upload Example using Common FIle Upload</h1>");
		DiskFileItemFactory fileItemFactory=new DiskFileItemFactory();
		fileItemFactory.setSizeThreshold(10*1024*1024);//10mb
		fileItemFactory.setRepository(tmpDir);
		ServletFileUpload uploadHandler=new ServletFileUpload(fileItemFactory);
		try {
			List items=uploadHandler.parseRequest(request);
			Iterator itr=items.iterator();
			while(itr.hasNext()){
				FileItem item=(FileItem) itr.next();
				if(item.isFormField()){
					out.println("<br/><h1>File Name="+item.getFieldName()+",Value="+item.getString());
				}else{
					out.println("<br/><h1>Field Name="+item.getFieldName()+",File Name="+item.getName()+",Content type="+item.getContentType()+",File Size="+item.getSize());
					File file=new File(destinationDir,item.getName());
					item.write(file);
				}
			}
			out.close();
		} catch (FileUploadException fue) {
			fue.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
