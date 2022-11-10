package com.zsavery.treehouseinc.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.zsavery.treehouseinc.data.Material;

@Repository
public interface MaterialDao extends JpaRepository<Material, Long>{
	List<Material> findAll();
	
	Material findById(long id);
	
	List<Float> findPriceById(long id);
	
	List<Material> findByName(String str);
	
	@Query("SELECT M.NAME, M.PRICE FROM Materials WHERE M.NAME = ?1")
	Material findPriceByName(String str);
	
	
	
}
