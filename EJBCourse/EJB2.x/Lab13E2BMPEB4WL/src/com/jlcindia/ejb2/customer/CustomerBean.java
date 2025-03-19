package com.jlcindia.ejb2.customer;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import javax.ejb.EJBException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.RemoveException;
import javax.sql.DataSource;

import com.jlcindia.ejb2.util.DataSourceUtil;

public class CustomerBean implements EntityBean{
	//BeanFields
	String cid;
	String cname;
	String email;
	String phone;
	//others
	EntityContext ec=null;
	DataSource ds=null;
	Connection con=null;
	PreparedStatement ps=null;
	
	public String ejbCreate(String cid,String cname,String email,String phone) {
		System.out.println("CustomerBean-ejbCreate()");
		//1.init
		this.cid=cid;
		this.cname=cname;
		this.email=email;
		this.phone=phone;
		//2.insert
		try {
			ds=DataSourceUtil.getDataSource();
			con=ds.getConnection();
			ps=con.prepareStatement("insert into customer(cid,cname,email,phone)values(?,?,?,?)");
			ps.setString(1, cid);
			ps.setString(2, cname);
			ps.setString(3, email);
			ps.setString(4, phone);
			int x=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DataSourceUtil.cleanup(ds, con, ps);
		}
		return cid;
	}
	
	public void ejbPostCreate(String cid,String cname,String email,String phone) {
		System.out.println("CustomerBean-ejbPostCreate()");
	}
	
	public String ejbCreate(String cid,String cname,String email) {
		System.out.println("CustomerBean-ejbCreate()");
		//1.init
		this.cid=cid;
		this.cname=cname;
		this.email=email;
		//2.insert
		try {
			ds=DataSourceUtil.getDataSource();
			con=ds.getConnection();
			ps=con.prepareStatement("insert into customer(cid,cname,email)values(?,?,?)");
			ps.setString(1, cid);
			ps.setString(2, cname);
			ps.setString(3, email);
			
			int x=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DataSourceUtil.cleanup(ds, con, ps);
		}
		return cid;
	}
	
	public void ejbPostCreate(String cid,String cname,String email) {
		System.out.println("CustomerBean-ejbPostCreate()");
	}
	public void ejbActivate() throws EJBException, RemoteException {
		System.out.println("CustomerBean-ejbActivate()");
	}
	public void ejbPassivate() throws EJBException, RemoteException {
		System.out.println("CustomerBean-ejbPassivate()");
	}
	public void ejbRemove() throws RemoveException, EJBException,
			RemoteException {
		System.out.println("CustomerBean-ejbRemove()");
		//delete
		try {
			ds=DataSourceUtil.getDataSource();
			con=ds.getConnection();
			ps=con.prepareStatement("delete from customer where cid=?");
			ps.setString(1, cid);
			int x=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DataSourceUtil.cleanup(ds, con, ps);
		}
	}
	public void ejbStore() throws EJBException, RemoteException {
		System.out.println("CustomerBean-ejbStore()");
		//update
		try {
			ds=DataSourceUtil.getDataSource();
			con=ds.getConnection();
			ps=con.prepareStatement("update customer set cname=?,email=?,phone=? where cid=?");
			ps.setString(1, cname);
			ps.setString(2, email);
			ps.setString(3, phone);
			ps.setString(4, cid);
			int x=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DataSourceUtil.cleanup(ds, con, ps);
		}
	}
	public void ejbLoad() throws EJBException, RemoteException {
		System.out.println("CustomerBean-ejbLoad()");
		//select
		try {
			ds=DataSourceUtil.getDataSource();
			con=ds.getConnection();
			ps=con.prepareStatement("select * from customer  where cid=?");
			ps.setString(1, cid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				this.cid=rs.getString("cid");
				this.cname=rs.getString("cname");
				this.email=rs.getString("email");
				this.phone=rs.getString("phone");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DataSourceUtil.cleanup(ds, con, ps);
		}
	}
	
	public String ejbFindByPrimaryKey(String cid) {
		System.out.println("CustomerBean-ejbFindByPrimaryKey()");
		//select
		try {
			ds=DataSourceUtil.getDataSource();
			con=ds.getConnection();
			ps=con.prepareStatement("select * from customer  where cid=?");
			ps.setString(1, cid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				this.cid=rs.getString("cid");
				this.cname=rs.getString("cname");
				this.email=rs.getString("email");
				this.phone=rs.getString("phone");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DataSourceUtil.cleanup(ds, con, ps);
		}
		return cid;
	}
	
	public Collection ejbFindAllCustomers() {
		System.out.println("CustomerBean-ejbFindAllCustomers()");
		Collection col=new ArrayList();
		//select
		try {
			ds=DataSourceUtil.getDataSource();
			con=ds.getConnection();
			ps=con.prepareStatement("select * from customer");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				col.add(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DataSourceUtil.cleanup(ds, con, ps);
		}
		return col;
	}
	
	public Collection ejbFindAllCustomersByName(String cname) {
		System.out.println("CustomerBean-ejbFindAllCustomersByName()");
		Collection col=new ArrayList();
		//select
		try {
			ds=DataSourceUtil.getDataSource();
			con=ds.getConnection();
			ps=con.prepareStatement("select * from customer where cname=?");
			ps.setString(1, cname);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				col.add(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DataSourceUtil.cleanup(ds, con, ps);
		}
		return col;
	}
	
	public String ejbFindCustomerByEmail(String email) {
		System.out.println("CustomerBean-ejbFindCustomerByEmail()");
		String id=null;
		//select
		try {
			ds=DataSourceUtil.getDataSource();
			con=ds.getConnection();
			ps=con.prepareStatement("select * from customer where email=?");
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				id=rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DataSourceUtil.cleanup(ds, con, ps);
		}
		return id;
	}
	public void setEntityContext(EntityContext ctx) throws EJBException,
			RemoteException {
		System.out.println("CustomerBean-setEntityContext()");
		this.ec=ctx;
	}
	public void unsetEntityContext() throws EJBException, RemoteException {
		System.out.println("CustomerBean-unsetEntityContext()");
		ec=null;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
