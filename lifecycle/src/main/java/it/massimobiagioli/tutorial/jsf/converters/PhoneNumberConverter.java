package it.massimobiagioli.tutorial.jsf.converters;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import it.massimobiagioli.tutorial.jsf.models.PhoneNumber;

@FacesConverter("phoneNumber")
public class PhoneNumberConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		System.out.println("** Converter phoneNumber invoked - getAsObject - String value: " + value);
		
		if ((value.length() < 5) || (!value.contains("-"))) {
			FacesMessage msg = new FacesMessage("Phone Convertion Failed", "Wrong phone number format");
		    msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(msg);
        }
				
		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setPrefix(value.substring(0, 3));
		phoneNumber.setNumber(value.substring(4));
		return phoneNumber;
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		System.out.println("** Converter phoneNumber invoked - getAsString - Object value: " + value);
		PhoneNumber phoneNumber = (PhoneNumber) value;
		StringBuilder sb = new StringBuilder();
		sb.append(phoneNumber.getPrefix())
			.append("-")
			.append(phoneNumber.getNumber());
		return sb.toString();
	}

}
