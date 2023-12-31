package com.store.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity 
@Table(name = "Orderdetails")
public class OrderDetail  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Double price;
	Integer quantity;
	String size;

	String note;
@ManyToOne
	@JoinColumn(name = "Productid")
	Product product;
	@ManyToOne
	@JoinColumn(name = "Orderid")
	Order order;
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public OrderDetail(Long id, Double price, Integer quantity, String size, String note, Product product,
			Order order) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.size = size;
		this.note = note;
		this.product = product;
		this.order = order;
	}
	public OrderDetail() {
		super();
	}
	public Long getId() {
		return id;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
