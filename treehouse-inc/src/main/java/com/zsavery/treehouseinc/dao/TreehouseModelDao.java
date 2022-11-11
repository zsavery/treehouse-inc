package com.zsavery.treehouseinc.dao;

import java.util.List;

import com.zsavery.treehouseinc.data.TreehouseModel;

public interface TreehouseModelDao {

	List<TreehouseModel> findAll();
	
	TreehouseModel findById(long id);
}
