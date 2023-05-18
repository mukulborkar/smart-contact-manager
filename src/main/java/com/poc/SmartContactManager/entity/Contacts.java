package com.poc.SmartContactManager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONTACTS")
public class Contacts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "cId")
	private int cId;
	
	@Column(name = "firstName")
	private String firstName; 
	
	@Column(name = "secondName")
	private String secondName;
	
	@Column(name = "work")
	private String work;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "image")
	private String image;

	@Column(length = 500)
	private String description;
	
	public Contacts(){
		
	}
	
	public Contacts(int cId, String firstName, String secondName, String work, String phone, String image, String description) {
		this.cId = cId;
		this.firstName = firstName;
		this.secondName = secondName;
		this.work = work;
		this.phone = phone;
		this.image = image;
		this.description = description;
	}
	
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Contacts [cId=" + cId + ", firstName=" + firstName + ", secondName=" + secondName + ", work=" + work + ", phone=" + phone
				+ ", image=" + image + ", description=" + description + ", ]";

	}

}
