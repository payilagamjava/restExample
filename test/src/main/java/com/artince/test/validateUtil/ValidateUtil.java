package com.artince.test.validateUtil;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.artince.test.exception.BadRequestException;
import com.artince.test.extra.CodeDescription;

public class ValidateUtil {

	public static void notNull(Object Obj) {
		if(Obj != null ){
			
		}else {
			throw new BadRequestException(CodeDescription.FAILURE);
			
		}
		
	}
	public static void emailCheck(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
		Pattern pat = Pattern.compile(emailRegex); 
		if (email == null) {
		
		}
		throw new BadRequestException(CodeDescription.INCORRECT_EMAIL);
	}
}
