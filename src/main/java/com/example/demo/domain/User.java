package com.example.demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name="DEMO_USER")
public class User {

	@Id
	@SequenceGenerator(name="DEMO_USER_SEQ", sequenceName="DEMO_USER_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEMO_USER_SEQ")
	private Long id;
	
	@Column(name="FIRST_NAME")
	private String fName;
	
	@Column(name="LAST_NAME")
	private String lName;
	
	@Column(name="HOME_PHONE")
	private String hPhone;
	
	@Column(name="CELL_PHONE")
	private String cPhone;
	
	@Column(name="EMAIL_ADDRESS")
	private String email;
	
//	@OneToMany
//	private List<Contact> contacts;
//	
	//@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL, mappedBy="user", fetch=FetchType.LAZY, orphanRemoval = true)
	private List<Address> addresses;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFName() {
		return fName;
	}
	public void setFName(String fName) {
		this.fName = fName;
	}
	public String getLName() {
		return lName;
	}
	public void setLName(String lName) {
		this.lName = lName;
	}
//	public List<Contact> getContacts() {
//		return contacts;
//	}
//	public void setContacts(List<Contact> contacts) {
//		this.contacts = contacts;
//	}
//	public List<Address> getAddresses() {
//		return addresses;
//	}
//	public void setAddresses(List<Address> addresses) {
//		this.addresses = addresses;
//	}
	public String getHPhone() {
		return hPhone;
	}
	public void setHPhone(String hPhone) {
		this.hPhone = hPhone;
	}
	public String getCPhone() {
		return cPhone;
	}
	public void setCPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
}
