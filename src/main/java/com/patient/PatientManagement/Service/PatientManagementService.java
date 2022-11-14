package com.patient.PatientManagement.Service;

import javax.xml.bind.ValidationException;

import org.springframework.stereotype.Component;

import com.patient.PatientManagement.SchemaObjects.PatientDetailsSO;

public interface PatientManagementService {
	
	public PatientDetailsSO savePatientDetails(PatientDetailsSO patientDetailsSO) throws ValidationException;


}
