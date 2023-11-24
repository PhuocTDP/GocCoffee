package com.store.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@SuppressWarnings("serial")
@Entity 
@Table(name = "Accounts")
public class Account implements Serializable{
	@Id
	String username;
	String password;
	String fullname;
	String email;
	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Order> orders;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Comment> comments;
	@JsonIgnore
	@OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
	List<Authority> authorities;
	
	public Account() {
		super();
	}
	
	public Account(String username, String password, String fullname, String email, List<Order> orders,
			List<Comment> comments, List<Authority> authorities) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.orders = orders;
		this.comments = comments;
		this.authorities = authorities;
	}






	public List<Comment> getComments() {
		return comments;
	}






	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}






	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}
}
