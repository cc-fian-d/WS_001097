package model;

import java.io.Serializable;
import java.util.Objects;
import java.util.stream.Stream;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.validator.ValidatorException;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@ApplicationScoped
public class UserValidator implements ConstraintValidator<UserValid, User>, Serializable {

	@Override
	public boolean isValid(User value, ConstraintValidatorContext context) {
		/**
		 * Kein Wert soll null sein.
		 */
		Object[] attribute = new Object[] { value.getName(), value.getPassword()};
		boolean tmp = Stream.of(attribute).noneMatch(Objects::isNull);
		
//		boolean pass = value.getPassword().matches("[A-Z]+[a-z]+[0-9]+");
		boolean pass = value.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,32}$");

		return tmp && pass;
	}

}
