package com.artince.test.extra;

public enum CodeDescription {
	
	SUCCESS(200,"Your Operation Done Successfully"),
	FAILURE(500,"Internal Server Error!!!!"),
	INCORRECT_EMAIL(600,"Please Enter Valid Email!!");
	
	int code;
	
	String description;
	
    private CodeDescription(int code,String description) {
		this.code = code;
		this.description=description;
	}
    
    private CodeDescription() {
    	
    }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
     
     

}
