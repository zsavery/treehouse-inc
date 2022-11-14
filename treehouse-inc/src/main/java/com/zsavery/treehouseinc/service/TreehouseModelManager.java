package com.zsavery.treehouseinc.service;

import java.util.List;

import com.zsavery.treehouseinc.data.TreehouseModel;

public interface TreehouseModelManager {
TreehouseModel createTreehouseModel(TreehouseModel m);
	
	void deleteTreehouseModel(TreehouseModel m);
	
	void deleteTreehouseModel(Long id);
	
	TreehouseModel findById(Long id);
	
	List<TreehouseModel> findAll();
	
	List<TreehouseModel> findByNames(String fname, String lname);
	
	TreehouseModel findByName(String fname, String lname);
}
