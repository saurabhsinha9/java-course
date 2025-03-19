package com.jlcindia.dao;

import com.jlcindia.bean.Address;

public interface AddressDAO {
	public void addAddress(Address address);
	public void deleteAddress(int addId);
	public void updateAddress(Address address);
	public Address findAddressByAid(int addId);
}
