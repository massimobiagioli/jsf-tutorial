package it.massimobiagioli.tutotial.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class DummyBean {
	
	public String getDummyMessage() {
		return "this is a dummy message";
	}
	
}
