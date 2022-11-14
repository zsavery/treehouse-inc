package com.zsavery.treehouseinc.service;

import java.util.List;

import com.zsavery.treehouseinc.data.WindowFrame;

public interface WindowFrameManager {

WindowFrame createWindowFrame(WindowFrame m);
	
	void deleteWindowFrame(WindowFrame m);
	
	void deleteWindowFrame(Long id);
	
	WindowFrame findById(Long id);
	
	List<WindowFrame> findAll();
	
	List<WindowFrame> findByNames(String fname, String lname);
	
	WindowFrame findByName(String fname, String lname);
}
