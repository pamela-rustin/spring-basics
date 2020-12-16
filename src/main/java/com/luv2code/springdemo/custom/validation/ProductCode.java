package com.luv2code.springdemo.custom.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = ProductCodeValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface ProductCode {
	
	public String value() default "PDT";
	
	public String message() default "must start with PDT";
	
	Class<?>[] groups() default { };
	
	Class<? extends Payload>[] payload() default { };


	
}
