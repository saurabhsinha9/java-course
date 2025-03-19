package com.jlcindia.dao.hibernate;

import com.jlcindia.bean.Address;
import com.jlcindia.dao.AddressDAO;
import com.jlcindia.dao.hibernate.util.PropertyUtil;
import com.jlcindia.to.AddressTO;
import com.jlcindia.util.CHibernateTemplate;


public class HibernateAddressDAO implements AddressDAO {

	public int addAddress(AddressTO ato) {
		Address add=PropertyUtil.getAddressFromAddressTO(ato);
		Integer it=(Integer)CHibernateTemplate.saveObject(add);
		return it.intValue();
	}

	public void updateAddress(AddressTO ato) {
		Address add=PropertyUtil.getAddressFromAddressTO(ato);
		CHibernateTemplate.updateObject(add);
	}

	public void deleteAddress(int addId) {
		CHibernateTemplate.deleteObject(Address.class, addId);
	}

	public AddressTO getAddressById(int addId) {
		Address add=(Address)CHibernateTemplate.loadObject(Address.class, addId);
		AddressTO ato=PropertyUtil.getAddressTOFromAddress(add);
		return ato;
	}

}
