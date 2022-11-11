package com.zsavery.treehouseinc.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="window_frames")
public class WindowFrame {
	@Id
	@GeneratedValue
	@Column(name="material_id")
	private long id;
	
	@Column(name="frame_name")
	private String name;
	
	@Column(name="price")
	private double price;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "WindowFrame [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
