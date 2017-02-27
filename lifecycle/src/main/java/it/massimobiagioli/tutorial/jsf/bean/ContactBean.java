package it.massimobiagioli.tutorial.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import it.massimobiagioli.tutorial.jsf.models.PhoneNumber;

@ManagedBean
@RequestScoped
public class ContactBean {

	private String name;
	private String surname;
	private String address;
	private PhoneNumber phoneNumber;
	
	public ContactBean() {
		System.out.println("* Constructor invoked");
	}
	
	public String save() {
		System.out.println("*** Action save invoked");
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
		System.out.println("* Method getName() invoked - value: " + name);
		return name;
	}

	public void setName(String name) {
		System.out.println("* Method setName() invoked");
		this.name = name;
	}

	public String getSurname() {
		System.out.println("* Method getSurname() invoked - value: " + surname);
		return surname;
	}

	public void setSurname(String surname) {
		System.out.println("* Method setSurname() invoked");
		this.surname = surname;
	}

	public String getAddress() {
		System.out.println("* Method getAddress() invoked - value: " + address);
		return address;
	}

	public void setAddress(String address) {
		System.out.println("* Method setAddress() invoked");
		this.address = address;
	}

	public PhoneNumber getPhoneNumber() {
		System.out.println("* Method getPhoneNumber() invoked - value: " + phoneNumber);
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		System.out.println("* Method setPhoneNumber() invoked");
		this.phoneNumber = phoneNumber;
	}

}
