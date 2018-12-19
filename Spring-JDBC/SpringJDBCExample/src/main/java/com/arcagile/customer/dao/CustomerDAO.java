package com.arcagile.customer.dao;

import com.arcagile.customer.model.Customer;

public interface CustomerDAO 
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}




