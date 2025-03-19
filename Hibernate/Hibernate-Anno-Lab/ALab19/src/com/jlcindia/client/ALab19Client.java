package com.jlcindia.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jlcindia.bean.Candidate;
import com.jlcindia.bean.ExpCandidate;
import com.jlcindia.bean.FreshCandidate;
import com.jlcindia.dao.CandidateDAO;
import com.jlcindia.factory.DAOFactory;

public class ALab19Client {

	public static void main(String[] args) {
		CandidateDAO candidateDAO=DAOFactory.getCustomerDAO();
		
		//Adding FreshCandidate
		List<String> email=new ArrayList<String>();
		email.add("sau@jlc");
		email.add("sau@gmail");
		email.add("sau@in");
		
		Map<String,Double> percent=new HashMap<String, Double>();
		percent.put("M.Tech", new Double(60));
		percent.put("B.Tech", new Double(75));
		FreshCandidate fc=new FreshCandidate("Saurabh","Sinha",email,"B.Tech","13-07-1989",2011,percent,"No");
		//candidateDAO.addCandidate(fc);
		
		//Adding ExpCandidate
		Set<String> skill=new HashSet<String>();
		skill.add("Java Core");
		skill.add("JDBC");
		skill.add("Servlet");
		skill.add("JSP");
		List<String> company=new ArrayList<String>();
		company.add("HCL");
		company.add("SDSOFT");
		company.add("K-Pro");
		
		ExpCandidate ec=new ExpCandidate("Dablu","Sinha",email,"M.Tech","89-13-07",skill,company,25000.0);
		//candidateDAO.addCandidate(ec);
		
		//2.Loading FreshCandidate
		FreshCandidate fcan=(FreshCandidate)candidateDAO.getCandidateByCid(1);
		System.out.println(fcan.getCid());
		System.out.println(fcan.getFname());
		System.out.println(fcan.getLname());
		System.out.println(fcan.getQualification());
		System.out.println(fcan.getEmails());
		System.out.println(fcan.getDob());
		System.out.println(fcan.getYop());
		System.out.println(fcan.getYearGaps());
		System.out.println(fcan.getPercentages());
		
		//3.Loading ExpCandidate
		ExpCandidate ecan=(ExpCandidate)candidateDAO.getCandidateByCid(2);
		System.out.println(ecan.getCid());
		System.out.println(ecan.getFname());
		System.out.println(ecan.getLname());
		System.out.println(ecan.getQualification());
		System.out.println(ecan.getEmails());
		System.out.println(ecan.getDob());
		System.out.println(ecan.getYoe());
		System.out.println(ecan.getSkills());
		System.out.println(ecan.getCompanies());
		System.out.println(ecan.getCtc());
		
		//5.Delete FreshCandidate
		//candidateDAO.deleteCandidate(7);
		
		//6.Delete ExpCandidate
		//candidateDAO.deleteCandidate(8);
		/*
		//7.Updating FreshCandidate
		FreshCandidate fcan1=(FreshCandidate)candidateDAO.getCandidateByCid(1);
		fcan1.setLname("Kumar Sinha");
		fcan1.setYearGaps("yes");
		candidateDAO.updateCandidate(fcan1);
		
		//8.Updating ExpCandidate
		ExpCandidate ecan1=(ExpCandidate)candidateDAO.getCandidateByCid(2);
		ecan1.setDob("10-10-10");
		ecan1.setYoe(5);
		candidateDAO.updateCandidate(ecan1);*/
		
		//9.Loading All Candidate
		List<Candidate> cans=candidateDAO.getAllCandidate();
		for(Candidate c:cans){
			System.out.println(c.getCid());
			System.out.println(c.getFname());
			System.out.println(c.getLname());
			System.out.println(c.getEmails());
			System.out.println(c.getQualification());
			System.out.println(c.getDob());	
		}
	}
}
