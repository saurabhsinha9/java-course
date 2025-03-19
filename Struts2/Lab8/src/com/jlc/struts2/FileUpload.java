package com.jlc.struts2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.opensymphony.xwork2.ActionSupport;


public class FileUpload extends ActionSupport {

	static{
		System.out.println("FileUpload-SB");
	}
	
	 public FileUpload() {
		 System.out.println("FileUpload-DC");
	}
	
	 private File resume;
	 private String resumeContentType;
	 private String resumeFileName;
	 private long size;
	 private String path;
	 
	 //setters and getters
	 public String getResumeContentType() {
		 System.out.println("getResumeContentType()");
		return resumeContentType;
	}


	public void setResumeContentType(String resumeContentType) {
		System.out.println("setResumeContentType()");
		this.resumeContentType = resumeContentType;
	}


	public String getResumeFileName() {
		System.out.println("getResumeFileName()");
		return resumeFileName;
	}


	public void setResumeFileName(String resumeFileName) {
		System.out.println("setResumeFileName()");
		this.resumeFileName = resumeFileName;
	}


	public long getSize() {
		System.out.println("getSize()");
		return size;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public void setSize(long size) {
		System.out.println("setSize()");
		this.size = size;
	}


	public File getResume() {
		System.out.println("setResume()");
		return resume;
	}


	public void setResume(File resume) {
		System.out.println("setResume()");
		this.resume = resume;
	}


	public String execute()throws Exception {
		 System.out.println("FileUpload-execute()");
		
		 
		 FileInputStream in=null;
		 FileOutputStream out=null;
		try {
			
			size=getResume().length();
			System.out.println(resumeFileName);
			System.out.println(size);
			System.out.println(resumeContentType);
			path="E:/W/b27-28/Struts2/UploadedFile/";
			System.out.println(path);
			in=new FileInputStream(getResume());
			String destFileName=path+resumeFileName;
			
			File destFile=new File(destFileName);
			
			if(!destFile.exists()){
				out=new FileOutputStream(destFile);
				int c;
				while((c=in.read())!=-1){
					out.write(c);
				}
			}
			in.close();
			out.close();
			return "success";
		} catch (Exception e) {
			addActionError(e.getMessage());
			return "input";
		}
		
	}
}
