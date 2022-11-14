package com.zsavery.treehouseinc.service;

import java.util.List;

import com.zsavery.treehouseinc.data.Customer;

public interface CustomerManager {

	Customer createCustomer(Customer m);
	
	void deleteCustomer(Customer m);
	
	void deleteCustomer(Long id);
	
	Customer findById(Long id);
	
	List<Customer> findAll();
	
	List<Customer> findByNames(String fname, String lname);
	
	Customer findByName(String fname, String lname);
}
