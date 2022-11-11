package com.zsavery.treehouseinc.dao;

import java.util.List;

import com.zsavery.treehouseinc.data.WindowFrame;

public interface WindowFrameDao {
	List<WindowFrame> findAll();
	
	WindowFrame findById(long id);
}
