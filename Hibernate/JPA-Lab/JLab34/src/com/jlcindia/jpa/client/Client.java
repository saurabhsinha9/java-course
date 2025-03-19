package com.jlcindia.jpa.client;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import com.jlcindia.bean.Account;
import com.jlcindia.bean.Address;
import com.jlcindia.bean.CurrentAccount;
import com.jlcindia.bean.Customer;
import com.jlcindia.bean.LoanAccount;
import com.jlcindia.bean.Request;
import com.jlcindia.bean.SavingsAccount;
import com.jlcindia.dao.AccountDAO;
import com.jlcindia.dao.AddressDAO;
import com.jlcindia.dao.CustomerDAO;
import com.jlcindia.dao.RequestDAO;
import com.jlcindia.factory.DAOFactory;

public class Client {
	
	public static void main(String[] args) {
		/*//1.Add Address
		Address add=new Address("MK","BLORE","INDIA","123456");
		AddressDAO adao=DAOFactory.getAddressDAO();
		adao.addAddress(add);
		
		//2.Add Customer
		Customer cust=new Customer("Saurabh","Sinha","sau@jlc",9999);
		CustomerDAO cdao=DAOFactory.getCustomerDAO();
		cdao.addCustomer(cust);
		
		//6.Add Saving Account
		SavingsAccount sa=new SavingsAccount("8/8/8/","BLORE",123456,10000,500);
		AccountDAO acdao=DAOFactory.getAccountDAO();
		acdao.addSavingsAccount(sa);
		
		//7.Add Current Account
		CurrentAccount ca=new CurrentAccount("9/9/9","Blore",2,3,795000.30,5000.0);
		AccountDAO acdao1=DAOFactory.getAccountDAO();
		acdao1.addCurrentAccount(ca);
		
		//8.Add Loan Account
		LoanAccount la=new LoanAccount("12/12/12","BLORE","HOME",500000.0,5,50000,4000);
		AccountDAO acdao2=DAOFactory.getAccountDAO();
		acdao2.addLoanAccount(la);

		//4.Add Request
		Request req=new Request("10/10/10","hai","ok");
		RequestDAO rdao=DAOFactory.getRequestDAO();
		rdao.addRequest(req);
		
		*/
		/*//3.Set Address to Customer
		CustomerDAO cdao1=DAOFactory.getCustomerDAO();
		cdao1.setAddressToCustomer(2, 5);
		
		//5.Set Customer to Request
		CustomerDAO cdao2=DAOFactory.getCustomerDAO();
		cdao2.setCustomerToRequest(3, 5);
		
		//9.Set SavingAccount to Customer
		CustomerDAO cdao3=DAOFactory.getCustomerDAO();
		cdao3.setSavingsAccountToCustomer(1, 4);
		
		//10.Set CurrentAccount to Customer
		CustomerDAO cdao4=DAOFactory.getCustomerDAO();
		cdao4.setCurrentAccountToCustomer(2, 4);
		
		//11.Set LoanAccount to Customer
		CustomerDAO cdao5=DAOFactory.getCustomerDAO();
		cdao5.setLoanAccountToCustomer(3, 4);*/
		
		//12.Find Customer by Cid
		CustomerDAO cdao6=DAOFactory.getCustomerDAO();
		Customer cust1=cdao6.findCustomerByCid(4);
		System.out.println("Customer Info");
		System.out.println(cust1.getCid()+"\t"+cust1.getFirstName()+"\t"+cust1.getLastName()+"\t"+cust1.getEmail()+"\t"+cust1.getPhone());
		System.out.println("-----");
		System.out.println("Account Info");
		Set<Account> accs=cust1.getAccounts();
		Iterator<Account> it1=accs.iterator();
		while(it1.hasNext()){
			Account acc1=it1.next();
			if(acc1 instanceof SavingsAccount){
				SavingsAccount sa1=(SavingsAccount) acc1;
				System.out.println(sa1.getAccno()+"\t"+sa1.getCreatedDate()+"\t"+sa1.getBranch()+"\t"+sa1.getBal()+"\t"+sa1.getMinBal()+"\t"+sa1.getDebitCardNo());
			}else if(acc1 instanceof CurrentAccount){
				CurrentAccount ca1=(CurrentAccount)acc1;
				System.out.println(ca1.getAccno()+"\t"+ca1.getCreatedDate()+"\t"+ca1.getCorpId()+"\t"+ca1.getBranch()+"\t"+ca1.getNou()+"\t"+ca1.getBal()+"\t"+ca1.getMinBal());
			}else if(acc1 instanceof LoanAccount){
				LoanAccount la1=(LoanAccount)acc1;
				System.out.println(la1.getAccno()+"\t"+la1.getCreatedDate()+"\t"+la1.getBranch()+"\t"+la1.getLoanType()+"\t"+la1.getLoanAmount()+"\t"+la1.getInterest()+"\t"+la1.getPeriod()+"\t"+la1.getEmi());
			}
			System.out.println("");
		}
		System.out.println("Address Info");
		Address add1=cust1.getAddress();
		System.out.println(add1.getAid()+"\t"+add1.getStreet()+"\t"+add1.getCity()+"\t"+add1.getCountry()+"\t"+add1.getPin());
		System.out.println("*****");
		System.out.println("Request Info");
		Collection<Request> col=cust1.getRequests();
		Iterator<Request> it=col.iterator();
		while(it.hasNext()){
			Request req1=it.next();
			System.out.println(req1.getReqId()+"\t"+req1.getReqDate()+"\t"+req1.getDescription()+"\t"+req1.getStatus());
		}
		System.out.println("-----");
		
	}
}
