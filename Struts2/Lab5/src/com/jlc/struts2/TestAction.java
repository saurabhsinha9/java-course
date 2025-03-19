package com.jlc.struts2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;



public class TestAction extends ActionSupport implements Preparable,ModelDriven<User>,
					ServletRequestAware,ServletResponseAware,RequestAware,SessionAware,ApplicationAware{
	
	
	static{
		System.out.println("TestAction-SB");
	}
	
	private List<Student> students; 
	 
	 public TestAction() {
		System.out.println("TestAction-DC");
		
		students=new ArrayList<Student>();
		
		List<String> ph=new ArrayList<String>();
					ph.add("111111");
					ph.add("222222");
					ph.add("333333");
					ph.add("444444");
			
		Address add=new Address("Blore",ph);
		
		List<Address> adds=new ArrayList<Address>();
					  adds.add(add);
					  adds.add(add);
					  adds.add(add);
					 
		Student stu=new Student("Srinivas",adds);
				students.add(stu);
				students.add(stu);
				students.add(stu);
				students.add(stu);
	 }
	 private User user;
	 private HttpServletRequest request;
	 private HttpServletResponse response;
	 private Map requestMap=null;
	
	 private Map sessionMap=null;
	 private Map contextMap=null;
	 
	 private Hello hello=new Hello();
	 Hello h=new Hello();
	 {
		 System.out.println(h.hai.msg);
	 }
	 public String execute() throws Exception{
		 System.out.println("TestAction-execute()-begin");
		 
		 System.out.println(user.getName());
		 System.out.println(user.getEmail());
		 System.out.println(user.getPhone());
		 System.out.println("TestAction-execute()-end");
		 setData();
		 showdata();
		 return "success";
	 }
	
	 
	 public void validate(){
		 System.out.println("TestAction-validate()-begin");
		 
		if(user.getName()==null||user.getName().length()==0){
			addActionError("Name is Required displaying using Action Error");
			addFieldError("name","Name is Required displaying using Field Error");
		}
		 
		if(user.getEmail()==null||user.getEmail().length()==0){
			addActionError("Email is Required displaying using Action Error");
			addFieldError("email1","Email is Required displaying using Field Error");
		}
		
		if(user.getPhone()==null||user.getPhone().length()==0){
			addActionError("Phone is Required displaying using Action Error");
			addFieldError("phone","Phone is Required displaying using Field Error");
		}
		
		 System.out.println("TestAction-validate()-end");
	 }
	
	public User getUser() {
		System.out.println("getUser()");
		return user;
	}


	public void setUser(User user) {
		System.out.println("setUser()");
		this.user = user;
	}

	public void prepare() throws Exception {
		System.out.println("prepare()-called due to Preparable");
		user=new User();
	}
	
	public User getModel() {
		System.out.println("getModel()-called due to ModelDriven<User>");
		return user;
	}
	
	public void setServletRequest(HttpServletRequest request) {
		System.out.println("setServletRequest()-called due to ServletRequestAware");
		this.request=request;
		
	}

	public void setServletResponse(HttpServletResponse response) {
		System.out.println("setServletResponse()-called due to ServletResponseAware");
		this.response=response;
	}
	
	
	private void setData() {
		System.out.println("TestAction-setData()-begin");
		request.setAttribute("EMAIL", user.getEmail());
		request.setAttribute("USER", user);
		requestMap.put("PHONE", user.getPhone());
		requestMap.put("MSG", "Welcome to JLC...");
		sessionMap.put("USER", user);
		contextMap.put("NAME", user.getName());
		ArrayList<String> names=new ArrayList<String>();
		names.add("Srinivas");
		names.add("Saurabh");
		names.add("Gaurav");
		names.add("Abhishek");
		sessionMap.put("NAMES", names);
		ArrayList<User> users=new ArrayList<User>();
				users.add(user);
				users.add(user);
				users.add(user);
				users.add(user);
				users.add(user);
				contextMap.put("USERS", users);
				sessionMap.put("JLC", students);
		System.out.println("TestAction-setData()-end");
	}

	private void showdata() {
		System.out.println("TestAction-showdata()-begin");
		System.out.println(request.getAttribute("EMAIL"));
		System.out.println(request.getRemoteAddr());
		System.out.println(response.getLocale().getLanguage());
		System.out.println(getLocale().getLanguage());
		System.out.println(requestMap.get("PHONE"));
		System.out.println(request.getAttribute("PHONE"));
		User u=(User) sessionMap.get("USER");
		System.out.println(u.getEmail());
		System.out.println(u.getPhone());
		System.out.println(contextMap.get("NAME"));
		System.out.println("TestAction-showdata()-end");
	}
	
	
	public void setRequest(Map requestMap) {
		System.out.println("setRequest()-called due to RequestAware");
		this.requestMap=requestMap;
	}

	public void setSession(Map sessionMap) {
		System.out.println("setSession()-called due to SessionAware");
		this.sessionMap=sessionMap;
		
	}

	
	
	public void setApplication(Map contextMap) {
		System.out.println("setApplication()-called due to ApplicationAware");
		this.contextMap=contextMap;
		
	}
	
	
	 public List<Student> getStudents() {
		 System.out.println("getStudents()");
			return students;
		}


		public void setStudents(List<Student> students) {
			System.out.println("setStudents()");
			this.students = students;
		}


		public Hello getHello() {
			System.out.println("getHello()");
			return hello;
		}


		public void setHello(Hello hello) {
			System.out.println("setHello()");
			this.hello = hello;
		}
	
}
