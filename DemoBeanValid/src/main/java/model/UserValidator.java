package model;

import java.io.Serializable;
import java.util.Objects;
import java.util.stream.Stream;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@ApplicationScoped
public class UserValidator implements ConstraintValidator<UserValid, User>, Serializable {

	@Override
	public boolean isValid(User value, ConstraintValidatorContext context) {
		/**
		 * Kein Wert soll null sein.
		 */
		Object[] attribute = new Object[] { value.getAge(), value.getFirstname(), value.getLastname() };
		boolean tmp = Stream.of(attribute).noneMatch(Objects::isNull);
		return tmp;
	}

}
