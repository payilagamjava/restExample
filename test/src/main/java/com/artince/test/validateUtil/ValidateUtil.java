package com.artince.test.validateUtil;

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
}
