package com.patient.PatientManagement.SchemaObjects;

public class patientIdentifierSO {
	
	private String identifier_type;
	
	private String identifier_number;

	/**
	 * @return the identifier_type
	 */
	public String getIdentifier_type() {
		return identifier_type;
	}

	/**
	 * @param identifier_type the identifier_type to set
	 */
	public void setIdentifier_type(String identifier_type) {
		this.identifier_type = identifier_type;
	}

	/**
	 * @return the identifier_number
	 */
	public String getIdentifier_number() {
		return identifier_number;
	}

	/**
	 * @param identifier_number the identifier_number to set
	 */
	public void setIdentifier_number(String identifier_number) {
		this.identifier_number = identifier_number;
	}

}
