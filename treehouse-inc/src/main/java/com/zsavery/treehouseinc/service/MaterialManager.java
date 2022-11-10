package com.zsavery.treehouseinc.service;

import java.util.List;

import com.zsavery.treehouseinc.data.Material;

public interface MaterialManager {
	Material createMaterial(Material m);
	
	void deleteMaterial(Material m);
	
	void deleteMaterial(Long id);
	
	Material findById(Long id);
	
	List<Material> findAll();
	
	List<Material> findByName(String str);

}
