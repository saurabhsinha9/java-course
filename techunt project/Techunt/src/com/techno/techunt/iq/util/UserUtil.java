package com.techno.techunt.iq.util;
import com.techno.techunt.iq.actions.to.UserTO;
import com.techno.techunt.iq.hibernate.pc.User;

public class UserUtil {
	public static UserTO getUserTOFromUser(User usr)
	{
		UserTO uto=new UserTO();
		uto.setBatchid(usr.getBatchid());
		uto.setBranchname(usr.getBranchname());
		uto.setEmail(usr.getEmail());
		uto.setNumberofquestion(usr.getNumberofquestion());
		uto.setPassword(usr.getPassword());
		uto.setPhone(usr.getPhone());
		uto.setRole(usr.getRole());
		uto.setSerialNo(usr.getSerialNo());
		uto.setStatus(usr.getStatus());
		uto.setStudentid(usr.getStudentid());
		uto.setStudname(usr.getStudname());
		uto.setUsername(usr.getUsername());
		return uto;
		
	}

	public static User getUserFromUserTO(UserTO usr) {
		User uto=new User();
		uto.setBatchid(usr.getBatchid());
		uto.setBranchname(usr.getBranchname());
		uto.setEmail(usr.getEmail());
		uto.setNumberofquestion(usr.getNumberofquestion());
		uto.setPassword(usr.getPassword());
		uto.setPhone(usr.getPhone());
		uto.setRole(usr.getRole());
		uto.setSerialNo(usr.getSerialNo());
		uto.setStatus(usr.getStatus());
		uto.setStudentid(usr.getStudentid());
		uto.setStudname(usr.getStudname());
		uto.setUsername(usr.getUsername());
		return uto;
	}
	
	

}
