package com.arcagile.customer.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.arcagile.customer.dao.CustomerDAO;

public class CustomerService 
{
	@Autowired
	CustomerDAO customerDAO;

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
		
}
