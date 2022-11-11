package com.zsavery.treehouseinc.dao;

import java.util.List;

import com.zsavery.treehouseinc.data.Customer;

public interface CustomerDao {

	List<Customer> findAll();
	
	Customer findById(long id);
}
