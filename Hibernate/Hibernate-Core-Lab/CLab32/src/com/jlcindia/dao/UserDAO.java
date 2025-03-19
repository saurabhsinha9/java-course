package com.jlcindia.dao;

import com.jlcindia.to.AuthorTO;
import com.jlcindia.to.CustomerTO;

public interface UserDAO {
	public int addCustomer(CustomerTO cto);
	public int addAuthor(AuthorTO ato);
	public CustomerTO getCustomerById(int userId);
	public AuthorTO getAuthorById(int authorId);
}
