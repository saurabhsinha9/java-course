package com.jlcindia.ejb;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jlcindia.dao.DAOFactory;
import com.jlcindia.dao.UserDAO;
import com.jlcindia.hibernate.User;
import com.jlcindia.to.UserTO;


@Stateless(name="UserManagerBean", mappedName="UserManagerBean")
@WebService(endpointInterface="com.jlcindia.ejb.UserManagerRemote")
public class UserManagerBean implements UserManagerRemote {

	private EntityManager manager;
	
	public int verifyUser(String un,String pw){
		Query q=manager.createQuery("from User user where user.username=:un and user.password=:pw");
		q.setParameter("un", un);
		q.setParameter("pw", pw);
		List<User> list=q.getResultList();
		return list.size();
	}

}
