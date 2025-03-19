package com.mypkg.param;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ParameterDemoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ParameterDemoServlet1() {
        super();
       System.out.println("ParameterServlet1-DC");
    }

	ServletContext sc=null;
	ServletContext sc1=null;
	ServletConfig config=null;
	String Cn=null;
	String web=null;
	String HO=null;
	String notavail=null;
	String em=null;
	String ph=null;
	String rn=null;
	
	public void init() throws ServletException {
		System.out.println("ParameterDemoServlet1-init()-start");
		sc=this.getServletContext();
		System.out.println(sc);
		config=this.getServletConfig();
		System.out.println(config);
		sc1=config.getServletContext();
		System.out.println(sc1);
		if(sc.equals(sc1)){
			System.out.println("Both are equal");
			System.out.println("You can create ServletContext object \n with ServletConfig reference variable also");
		}
		
		Cn=sc.getInitParameter("CompanyName");
		web=sc1.getInitParameter("website");
		HO=sc.getInitParameter("HeadOffice");
		notavail=sc.getInitParameter("nkf");
		m1();
		System.out.println("Accessing the ContextParameter Names");
		Enumeration e=sc.getInitParameterNames();
		System.out.println(e);
		while(e.hasMoreElements()){
		Object o=e.nextElement();
		System.out.println(o);
		System.out.println("ContextParameter Names Accessed");
		}
		
		System.out.println("Accessing the ConfigParameter");
		em=config.getInitParameter("email");
		ph=config.getInitParameter("phone");
		rn=config.getInitParameter("RegistrationNumber");
		m2();
		System.out.println("ConfigParameter Accessed");
		System.out.println("Accessing the ConfigParameter Names");
		Enumeration e1=config.getInitParameterNames();
		System.out.println(e1);
		while(e1.hasMoreElements()){
		Object o=e1.nextElement();
		System.out.println(o);
		System.out.println("ConfigParameter Names Accessed");
		}
		System.out.println("ParameterDemoServlet1-init()-end");
	}
private void m2() {
	System.out.println(em+"\n"+ph+"\n"+rn);	
}
private void m1(){
	System.out.println("----ContextParameters-Accessing--");
	System.out.println(Cn+"\n"+web+"\n"+HO+"\n"+notavail);
	System.out.println("-----ContextParameters-Accessed-----");
}
	
	public void destroy() {
		System.out.println("ParameterDemoServlet1-destroy()");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ParameterDemoServlet1-service()");
		String nm=request.getParameter("uname1");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><head><title>home</title></head><center><body>");
		pw.println("<h1>Parameter Test</h1>");
		pw.println("<hr/>");
		pw.println("<h1>Request Parameter</h1>");
		pw.println("<h1>"+nm+"</h1><br/>");
		pw.println("<hr/>");
		pw.println("<h1>Context Parameter</h1>");
		pw.println("<h1>"+Cn+"</h1><br/>");
		pw.println("<h1>"+web+"</h1><br/>");
		pw.println("<h1>"+HO+"</h1><br/>");
		pw.println("<hr/>");
		pw.println("<h1>Cofig Parameter</h1>");
		pw.println("<h1>"+em+"</h1><br/>");
		pw.println("<h1>"+ph+"</h1><br/>");
		pw.println("<h1>"+rn+"</h1><br/>");
		pw.println("<hr/>");
		System.out.println("ParameterDemoServlet1-service() end");
	}

}
