package com.zsavery.treehouseinc.data;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Invoices {
	@Id
	@GeneratedValue
	@Column(name="model_id")
    private long id;
	
	@Column(name="order_date")
	private Date order_date;
	
	@Column(name="fulfillment_date")
	private Date fulfillment_date;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Customer.class)
	@JoinColumn(name = "customer_id")
	private long customer_id;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Material.class)
	@JoinColumn(name = "material_id")
	private long material_id;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = TreehouseModel.class)
	@JoinColumn(name = "model_id")
	private long model_id;
	
	@Column(name="price")
	private double price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public Date getFulfillment_date() {
		return fulfillment_date;
	}

	public void setFulfillment_date(Date fulfillment_date) {
		this.fulfillment_date = fulfillment_date;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public long getMaterial_id() {
		return material_id;
	}

	public void setMaterial_id(long material_id) {
		this.material_id = material_id;
	}

	public long getModel_id() {
		return model_id;
	}

	public void setModel_id(long model_id) {
		this.model_id = model_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Invoices [id=" + id + ", order_date=" + order_date + ", fulfillment_date=" + fulfillment_date
				+ ", customer_id=" + customer_id + ", material_id=" + material_id + ", model_id=" + model_id
				+ ", price=" + price + "]";
	}
}
