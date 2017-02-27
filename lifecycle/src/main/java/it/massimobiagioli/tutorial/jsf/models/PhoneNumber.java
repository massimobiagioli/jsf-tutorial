package it.massimobiagioli.tutorial.jsf.models;

public class PhoneNumber {
	
	private String prefix;
	private String number;
	
	public String getPrefix() {
		return prefix;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Prefix: ")
			.append(this.prefix)
			.append(" - Number: ")
			.append(this.number);
		return sb.toString();
	}
	
}
