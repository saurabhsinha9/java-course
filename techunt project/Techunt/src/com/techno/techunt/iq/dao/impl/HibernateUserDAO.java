package com.techno.techunt.iq.dao.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.techno.techunt.iq.actions.to.UserTO;
import com.techno.techunt.iq.dao.UserDAO;
import com.techno.techunt.iq.hibernate.pc.User;
import com.techno.techunt.iq.util.UserUtil;

public class HibernateUserDAO implements UserDAO{
@Autowired
private HibernateTemplate hibernateTemplate;

	@Override
	public UserTO verifyUser(String username, String password) {
	List<User> list=hibernateTemplate.find("from User usr where usr.username=? and usr.password=?", new Object[]{username,password});
	System.out.println(list);
	System.out.println(list.get(0).getUsername());
	//System.out.println(list.get(1));
	if(list!=null && list.size()>0)
	{
		if(list.get(0).getPassword().equals(password))
		{
			return UserUtil.getUserTOFromUser(list.get(0));
		}
		
}
	return null;
	}

	@Override
	public boolean registerUser(UserTO uto) {
		User usr=UserUtil.getUserFromUserTO(uto);
		Long value=(Long) hibernateTemplate.save(usr);
		if(value>0)
		{
			System.out.println("ur data has been saved");
			return true;
			
		}
		return false;
		
		
		
	}

}
