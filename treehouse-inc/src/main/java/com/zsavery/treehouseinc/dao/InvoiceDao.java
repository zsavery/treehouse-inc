package com.zsavery.treehouseinc.dao;

import java.util.List;

import com.zsavery.treehouseinc.data.Invoice;

public interface InvoiceDao {
	
	List<Invoice> findAll();
	
	Invoice findById(long id);
}
