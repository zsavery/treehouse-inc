package com.zsavery.treehouseinc.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materials")
public class Material {
	@Id
	@GeneratedValue
	@Column(name="material_id")
    private long id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="color")
    private String color;
	
	@Column(name="price")
    private float price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Material [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
