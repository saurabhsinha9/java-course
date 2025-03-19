package com.jlcindia.dao.jpa;

import com.jlcindia.bean.Address;
import com.jlcindia.dao.AddressDAO;
import com.jlcindia.dao.JLCBaseDAO;

public class JPAAddressDAO extends JLCBaseDAO implements AddressDAO {

	public void addAddress(Address address) {
		getJPATemplate().persist(address);
	}

	public void deleteAddress(int addId) {
		Address add=(Address)getJPATemplate().find(Address.class,new Integer(addId));
		getJPATemplate().remove(add);
	}

	public Address findAddressByAid(int addId) {
		Address add=(Address)getJPATemplate().find(Address.class,new Integer(addId));
		return add;
	}

	public void updateAddress(Address address) {
		getJPATemplate().merge(address);
	}

}
