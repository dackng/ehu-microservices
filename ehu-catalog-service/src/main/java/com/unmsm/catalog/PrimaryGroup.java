package com.unmsm.catalog;

public enum PrimaryGroup {
    CIVIL_STATE(1),
    EMR_STATE(2),
	EAP(3),
	HEALTH_PLAN(4),
	SYMPTOM_TYPE(5),
	CIE(6),
	SEROLOGICAL_TEST(7),
	BLOOD_TYPE(8),
	RADIOLOGY_TYPE(9),
	PSYCHOLOGICAL_DIAGNOSIS(10),
	HEMOGLOBIN_STATE(11);
	private Integer value;
	
	private PrimaryGroup(Integer value){ 
		this.value = value; 
	}
	public Integer getValue() {
        return value;
    }
}
