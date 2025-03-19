package com.jlcindia.dao;

import com.jlcindia.to.AddressTO;



public interface AddressDAO {
	public int addAddress(AddressTO ato);
	public void updateAddress(AddressTO ato);
	public void deleteAddress(int addId);
	public AddressTO getAddressById(int addId);
}
