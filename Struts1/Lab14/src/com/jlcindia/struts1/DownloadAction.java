package com.jlcindia.struts1;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import java.io.File;

public class DownloadAction extends DispatchAction{
	
	static{
		System.out.println("DownloadAction-SB");
	}
	
	public DownloadAction() {
		System.out.println("DownloadAction-DC");
	}
	
	public ActionForward downloadProfile(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		System.out.println("DownloadAction-downloadProfile()");
		try{
		String idocPath="E:/W/b27-28/Struts/Lab14/";
		String fileName="s.pdf";
		
		String filePath=idocPath+fileName;
		res.setContentType("APPLICATION/OCTET-STREAM");
		String disHeader="Attachment;Filename="+fileName;
		res.setHeader("Content-Disposition", disHeader);
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(file);
		int i;
		while((i=fis.read())!=-1){
			res.getOutputStream().write(i);
		}
		res.getOutputStream().flush();
		res.getOutputStream().close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}	
}
