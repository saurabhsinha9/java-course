package com.consona.consonabank.mvc;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.consona.consonabank.services.AccountService;
import com.consona.consonabank.services.CustomerService;
import com.consona.consonabank.to.CustomerTO;


@Controller
@SessionAttributes
public class UserController {
	
	@Autowired
	private UserValidator userValidator;
	@Autowired
	CustomerService custService;
	@Autowired
	AccountService accService;
	
	@RequestMapping(value="/verifyUser",method=RequestMethod.POST)
	public String verifyUser(@ModelAttribute("user") User user,
			BindingResult result,HttpSession session)
	{
		
		System.out.println("verifyUser()");
		userValidator.validate(user, result);
		if(result.hasErrors())
		{
			System.out.println(result.getErrorCount());
			return "LoginDef";
		}
		
		
		String un=user.getUsername();
		String pw=user.getPassword();
		
		CustomerTO cto=custService.verifyCustomer(un, pw);
		if(cto==null)
		{
			result.rejectValue("error","error.login.invalid",null,"Username or password is invalid");
			return "LoginDef";
			
			
		}
		else
		{
			int cid=cto.getCid();
			session.setAttribute("CTO",cto);
			System.out.println(cid);
			return "HomeDef";
		}
	}
		
		@RequestMapping("/loginhome.do")
		public String showLoginHome(Map model)throws ServletException
		{
			System.out.println("showLoginHome");

			User user=new User();
			user.setUsername("raj");
			model.put("user", user);
			return "LoginDef";
			
		}
		

}	
		
		
		
		
		
		
		
		
		
		
	