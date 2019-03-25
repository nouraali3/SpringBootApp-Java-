package com.noura.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DRIVER", schema="asn")
public class Driver {
	
	@Id
	@GeneratedValue
	@Column(name="DRIVER_ID")
	private int id;
	
	@Column(name="DRIVER_NAME")
	private String name;

	public Driver() {
	}
	
	public Driver(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
