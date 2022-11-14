package com.patient.PatientManagement.Controller;

import javax.xml.bind.ValidationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.patient.PatientManagement.SchemaObjects.PatientDetailsSO;

@RestController
@RequestMapping("patient")
public class PatientManagementController {
	
	private static final Logger		logger	= LoggerFactory.getLogger(PatientManagementController.class);

	
	@RequestMapping(value = "/savePatientDetails", produces = "application/json")
	public @ResponseBody PatientDetailsSO savePatientDetails(@RequestBody PatientDetailsSO patientDetailsSO) throws ValidationException
	{
		logger.info("Inside the PatientManagementController.savePatientDetails method..");
		
		//PatientDetailsSO patientDetailsSO=bankDetailsDelegate.saveBankDetails(bankDetailSO);
		return patientDetailsSO;
	}
}
