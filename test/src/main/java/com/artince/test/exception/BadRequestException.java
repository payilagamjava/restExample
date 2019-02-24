package com.artince.test.exception;

import com.artince.test.extra.CodeDescription;

public class BadRequestException extends RuntimeException{

	int responseCode;
	
	String responseDescription;
	
	Object responseObject;
	
	public BadRequestException(CodeDescription codeDescription) {
		this.responseCode = codeDescription.getCode();
		this.responseDescription = codeDescription.getDescription();
		this.responseObject = null;

	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDescription() {
		return responseDescription;
	}

	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	public Object getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(Object responseObject) {
		this.responseObject = responseObject;
	}
	
	
	
}
