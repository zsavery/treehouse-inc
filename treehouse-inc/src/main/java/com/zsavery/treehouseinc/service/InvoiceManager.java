package com.zsavery.treehouseinc.service;

import java.util.List;

import com.zsavery.treehouseinc.data.Invoice;

public interface InvoiceManager {
	Invoice createInvoice(Invoice m);
	
	void deleteInvoice(Invoice m);
	
	void deleteInvoice(Long id);
	
	Invoice findById(Long id);
	
	List<Invoice> findAll();
	
	List<Invoice> findByNames(String fname, String lname);
	
	Invoice findByName(String fname, String lname);

}
