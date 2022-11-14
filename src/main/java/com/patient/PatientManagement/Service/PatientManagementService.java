package com.patient.PatientManagement.Service;

import javax.xml.bind.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.PatientManagement.SchemaObjects.PatientDetailsSO;
import com.patient.PatientManagement.dao.PatientDao;

@Service
public class PatientManagementService {
	
	@Autowired
	private PatientDao patientDao;
	
	public PatientDetailsSO saveBankDetails(PatientDetailsSO patientDetailsSO) throws ValidationException {
    	return patientDao.savePatientDetails(patientDetailsSO);
    } 

}
