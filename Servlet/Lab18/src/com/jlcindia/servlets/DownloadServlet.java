package com.jlcindia.servlets;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DownloadServlet extends HttpServlet {
	ServletConfig config=null;
	ServletContext context=null;
	public void init(ServletConfig cfg) throws ServletException {
		config=cfg;
		context=cfg.getServletContext();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fileName");
		try {
			String file=config.getServletContext().getRealPath(fname);
			File f=new File(file);
			int length=0;
			ServletOutputStream op=response.getOutputStream();
			String mimetype=context.getMimeType(f.getName());
			response.setContentType((mimetype!=null)?mimetype:"application/octet-stream");
			response.setContentLength((int)f.length());
			response.setHeader("Content-Disposition", "attachment;filename=\""+f.getName()+"\"");
			byte []bbuf=new byte[(int)f.length()];
			DataInputStream in=new DataInputStream(new FileInputStream(f));
			while((in!=null)&&((length=in.read(bbuf))!=-1)){
				op.write(bbuf,0,length);
			}
			in.close();
			op.flush();
			op.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
