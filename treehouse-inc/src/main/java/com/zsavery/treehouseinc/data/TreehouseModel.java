package com.zsavery.treehouseinc.data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="window_frames")
public class TreehouseModel {

	@Id
	@GeneratedValue
	@Column(name="model_id")
    private long id;
	
	@Column(name="model_name")
	private String model_name;
	
	@Column(name="window_number")
	private long window_number;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = WindowFrame.class)
	@JoinColumn(name = "window_id")
	private long window_id;
	
	@Column(name="price")
	private double price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public long getWindow_number() {
		return window_number;
	}

	public void setWindow_number(long window_number) {
		this.window_number = window_number;
	}

	public long getWindow_id() {
		return window_id;
	}

	public void setWindow_id(long window_id) {
		this.window_id = window_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TreehouseModel [id=" + id + ", model_name=" + model_name + ", window_number=" + window_number
				+ ", window_id=" + window_id + ", price=" + price + "]";
	}	
}
