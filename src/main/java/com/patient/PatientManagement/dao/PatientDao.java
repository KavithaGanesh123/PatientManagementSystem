package com.patient.PatientManagement.dao;

import javax.xml.bind.ValidationException;

import com.patient.PatientManagement.SchemaObjects.PatientDetailsSO;

public interface PatientDao {
	
	public PatientDetailsSO savePatientDetails(PatientDetailsSO patientDetailsSO) throws ValidationException;

}
