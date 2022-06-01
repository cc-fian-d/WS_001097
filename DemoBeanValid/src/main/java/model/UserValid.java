package model;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;


@Retention(RUNTIME)
@Target({ TYPE, FIELD })
@Constraint(validatedBy = UserValidator.class)
public @interface UserValid {

	String message() default "Userdaten invalid";
	
	Class[] groups() default {};
	
	Class[] payload() default {};
	
}
