package com.artince.test.extra;

import java.io.Serializable;

public class BaseDto implements Serializable{

	int responseCode;
	
	String responseDescription;
	
	Object responseObject;
	
	public BaseDto(CodeDescription codeDescription ,Object obj) {
		this.responseCode = codeDescription.getCode();
		this.responseDescription = codeDescription.getDescription();
		this.responseObject = obj;
	}
	
	public BaseDto(CodeDescription codeDescription) {
		this.responseCode = codeDescription.getCode();
		this.responseDescription = codeDescription.getDescription();
		this.responseObject = null;

	}
	
	public BaseDto() {
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
