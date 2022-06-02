package model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD })
@Constraint(validatedBy = UserValidator.class)
public @interface UserValid {

	String message() default "Userdaten invalid";
	
	Class[] groups() default {};
	
	Class[] payload() default {};
	
}
