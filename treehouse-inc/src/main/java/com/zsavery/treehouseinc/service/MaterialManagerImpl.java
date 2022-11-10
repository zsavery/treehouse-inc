package com.zsavery.treehouseinc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsavery.treehouseinc.dao.MaterialDao;
import com.zsavery.treehouseinc.data.Material;

@Service
public class MaterialManagerImpl implements MaterialManager {

	
	private MaterialDao daoMaterial;
	
	@Autowired
	public MaterialManagerImpl(MaterialDao daoMaterial) {
		super();
		this.daoMaterial = daoMaterial;
	}

	@Override
	public Material createMaterial(Material m) {
		return daoMaterial.save(m);
	}

	@Override
	public void deleteMaterial(Material m) {
		daoMaterial.delete(m);

	}

	@Override
	public void deleteMaterial(Long id) {
		daoMaterial.deleteById(id);

	}

	@Override
	public Material findById(Long id) {
		if(daoMaterial.findById(id) != null)
			return daoMaterial.getReferenceById(id);
		return null;
	}

	@Override
	public List<Material> findAll() {
		return daoMaterial.findAll();
	}

	@Override
	public List<Material> findByName(String str) {
		return daoMaterial.findByName(str);
	}

}
