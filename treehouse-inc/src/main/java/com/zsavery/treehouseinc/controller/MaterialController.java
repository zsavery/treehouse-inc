package com.zsavery.treehouseinc.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zsavery.treehouseinc.data.Material;
import com.zsavery.treehouseinc.service.MaterialManager;

@RestController
@RequestMapping("/materials")
public class MaterialController {

	@Autowired
	private MaterialManager manager;

	private static final Logger logger = LogManager.getLogger(MaterialController.class);
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path = "/createMaterial", produces = "application/json", consumes = "application/json")
	public Material create(@RequestBody Material material) {
		logger.info("POST to /createMaterial" + "\nCreated new material");
		material = manager.createMaterial(material);
		return material;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping(path="", produces = "application/json")
	public List<Material> getAll() {
		logger.info("GET to /materials");
		return manager.findAll();
	}
	
}
