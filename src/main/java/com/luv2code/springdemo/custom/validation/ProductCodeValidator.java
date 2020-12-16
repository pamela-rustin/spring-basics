package com.luv2code.springdemo.custom.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductCodeValidator implements ConstraintValidator<ProductCode, String>{
	
	private String codePrefix;
	
	
	public void initialize(ProductCode product_code) {
		this.codePrefix = product_code.value();
			
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result ;
		
		if(value!=null) {
			result = value.startsWith(codePrefix);
		}else {
			result = true;
		}
		
		return result;
	}

	public String getCodePrefix() {
		return codePrefix;
	}

	public void setCodePrefix(String codePrefix) {
		this.codePrefix = codePrefix;
	}

}
