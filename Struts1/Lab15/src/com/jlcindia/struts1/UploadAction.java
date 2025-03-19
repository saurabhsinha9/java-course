package com.jlcindia.struts1;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;

import java.io.File;

public class UploadAction extends DispatchAction{
	
	static{
		System.out.println("UploadAction-SB");
	}
	
	
	public UploadAction() {
		System.out.println("UploadAction-DC");
	}
	
	
	public ActionForward uploadFile(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		System.out.println("UploadAction-uploadFile()");
		DynaActionForm df=(DynaActionForm) af;
		FormFile theFile=(FormFile) df.get("theFile");
		String contentType=theFile.getContentType();
		String fileName=theFile.getFileName();
		int fileSize=theFile.getFileSize();
		byte []fileData=theFile.getFileData();
		String fileExist="false";
		String filePath="E:/W/b27-28/Struts/Lab15/myuploadedfiles/";
		if(!fileName.equals("")){
			File fileToCreate=new File(filePath,fileName);
			if(!fileToCreate.exists()){
				FileOutputStream fos=new FileOutputStream(fileToCreate);
				fos.write(theFile.getFileData());
				fos.flush();
				fos.close();
				req.setAttribute("fileName", fileName);
				req.setAttribute("filePath", filePath);
			}else{
				fileExist="true";
				req.setAttribute("fileName", fileName);
				
			}
			req.setAttribute("fileExist", fileExist);
			}
		return am.findForward("success");
	}	
}
