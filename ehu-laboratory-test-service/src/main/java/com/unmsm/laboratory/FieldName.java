package com.unmsm.laboratory;

public enum FieldName {
	IS_FINISHED("isFinished");
	
	private String value;
	private FieldName(String value){ 
		this.value = value; 
	}
	public String getValue() {
        return value;
    }
}