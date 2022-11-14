package com.patient.PatientManagement.dao;

import java.lang.reflect.InvocationTargetException;

import javax.xml.bind.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.patient.PatientManagement.Entity.Patient;
import com.patient.PatientManagement.Repository.PatientDetailsRepository;
import com.patient.PatientManagement.SchemaObjects.PatientDetailsSO;
import com.patient.PatientManagement.util.GenericUtils;
@Component
public class PatientDao {
	
	  @Autowired
	    private GenericUtils genericUtils;
	  
	  @Autowired
	  private PatientDetailsRepository patientDetailsRepository;
	
	public PatientDetailsSO savePatientDetails(PatientDetailsSO patientDetailsSO) throws ValidationException{
		
		Patient newPatient=new Patient();
		
		PatientDetailsSO newPatientDetailsSO=new PatientDetailsSO();
		
		try {
		genericUtils.copyProperties(newPatient, patientDetailsSO);
		}catch( IllegalAccessException | InvocationTargetException e) {
		    throw new RuntimeException(e);
		}
		
		newPatient=patientDetailsRepository.saveAndFlush(newPatient);
		
		try {
		genericUtils.copyProperties(newPatientDetailsSO, newPatient);
		}catch( IllegalAccessException | InvocationTargetException e) {
		    throw new RuntimeException(e);
		}
		
		
		return patientDetailsSO;
	}
	

}
