package it.massimobiagioli.tutorial.jsf.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import it.massimobiagioli.tutorial.jsf.models.PhoneNumber;

@FacesValidator("phoneNumberValidator")
public class PhoneNumberValidator implements Validator {

	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		System.out.println("** Validator phoneNumber invoked - Object value: " + value);
		PhoneNumber phoneNumber = (PhoneNumber) value;
		if (phoneNumber.getNumber().length() < 5) {
			FacesMessage msg = new FacesMessage("Phone Validator Failed", "Please provide valid phone number");
		    msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		    throw new ValidatorException(msg);	
		}		
	}

}
