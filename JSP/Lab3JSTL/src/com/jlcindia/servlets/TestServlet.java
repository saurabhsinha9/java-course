package com.jlcindia.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jlcindia.beans.Account;
import com.jlcindia.beans.Address;
import com.jlcindia.beans.Customer;


public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses=request.getSession();
		ServletContext ctx=ses.getServletContext();
		
		//1.Strings,Wrappers and Date
		request.setAttribute("EM", "sri@jlc");
		ses.setAttribute("PH", new Long(12345));
		ctx.setAttribute("DOB", new Date());
		
		//2.COllection of Strings,Wrappers and Date.
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(new Integer(11));
		al.add(new Integer(22));
		al.add(new Integer(33));
		al.add(new Integer(44));
		al.add(new Integer(55));
		
		request.setAttribute("AL", al);
		
		String str[]={"dd","ss","jlc","sri"};
		ses.setAttribute("STR",str);
		
		//3.COllection of Collections
		ArrayList<ArrayList> al1=new ArrayList<ArrayList>();
		al1.add(al);
		al1.add(al);
		al1.add(al);
		
		request.setAttribute("AL1", al1);
		
		//4.Custom or User defined class object
		Address add=new Address("HMT main Road","Bangalore");
		Account acc=new Account(101,"SA",9999.9,add);
		Customer cust=new Customer(99,"sri","sri@jlc",9999,acc);
		ses.setAttribute("CUST", cust);
		//5.Collection or User defined class object
		ArrayList<Customer> cs=new ArrayList<Customer>();
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		ses.setAttribute("CS",cs);
		
		//6.Map object
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("sid","11");
		hm.put("sname", "sri");
		hm.put("email", "sri@jlc");
		
		ses.setAttribute("HM", hm);
		
		//7.Collection of Map object(*JSTL)
		ArrayList<HashMap<String, String>> al2=new ArrayList<HashMap<String, String>>();
		al2.add(hm);
		al2.add(hm);
		al2.add(hm);
		
		ses.setAttribute("AL2",al2);
		
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		
		rd.forward(request, response);
	}

}
