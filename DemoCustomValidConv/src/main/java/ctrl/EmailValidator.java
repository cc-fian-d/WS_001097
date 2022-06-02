package ctrl;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "mailValidator")
public class EmailValidator implements Validator<String> {

	@Override
	public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
		
		if(!value.contains("@")) {
			FacesMessage message = new FacesMessage("Die E-Mail enthielt kein at Zeichen");
			throw new ValidatorException(message);
		}
		
		if(value.contains("trashmail.com")) {
			FacesMessage message = new FacesMessage("Bitte keine wegwerf E-Mail verwenden");
			throw new ValidatorException(message);
		}
		
		
	}



}
