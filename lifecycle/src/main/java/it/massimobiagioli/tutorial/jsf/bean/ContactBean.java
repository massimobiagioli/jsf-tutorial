package it.massimobiagioli.tutorial.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ContactBean {

	private String name;
	private String surname;
	private String address;
	private String phoneNumber;
	
	public String save() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ")
			.append(this.getName())
			.append(" - Cognome: ")
			.append(this.getSurname())
			.append(" - Indirizzo: ")
			.append(this.getAddress());
		
		System.out.println(sb.toString());
		return null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
