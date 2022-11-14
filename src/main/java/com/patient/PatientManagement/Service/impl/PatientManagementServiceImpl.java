package com.patient.PatientManagement.Service.impl;

import javax.xml.bind.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.PatientManagement.SchemaObjects.PatientDetailsSO;
import com.patient.PatientManagement.Service.PatientManagementService;
import com.patient.PatientManagement.dao.PatientDao;

@Service

public class PatientManagementServiceImpl implements PatientManagementService{
	
	@Autowired
	private PatientDao patientDao;
	
	@Override
	public PatientDetailsSO savePatientDetails(PatientDetailsSO patientDetailsSO) throws ValidationException

	{
		return patientDao.savePatientDetails(patientDetailsSO);
	}
	
	

}
