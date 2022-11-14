package com.patient.PatientManagement.SchemaObjects;

import java.util.Date;
import java.util.List;

public class PatientDetailsSO {
	
	private String patientName;
	
	private Date patientDOB;
	
	private Integer patientAadharNum;
	
	private List<AddressListSO> patientAddresses;
	
	
	private Integer contactNumber;
	
	private Integer alternateContactNumber;

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * @return the patientDOB
	 */
	public Date getPatientDOB() {
		return patientDOB;
	}

	/**
	 * @param patientDOB the patientDOB to set
	 */
	public void setPatientDOB(Date patientDOB) {
		this.patientDOB = patientDOB;
	}

	/**
	 * @return the patientAadharNum
	 */
	public Integer getPatientAadharNum() {
		return patientAadharNum;
	}

	/**
	 * @param patientAadharNum the patientAadharNum to set
	 */
	public void setPatientAadharNum(Integer patientAadharNum) {
		this.patientAadharNum = patientAadharNum;
	}

	/**
	 * @return the patientAddresses
	 */
	public List<AddressListSO> getPatientAddresses() {
		return patientAddresses;
	}

	/**
	 * @param patientAddresses the patientAddresses to set
	 */
	public void setPatientAddresses(List<AddressListSO> patientAddresses) {
		this.patientAddresses = patientAddresses;
	}


	/**
	 * @return the contactNumber
	 */
	public Integer getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the alternateContactNumber
	 */
	public Integer getAlternateContactNumber() {
		return alternateContactNumber;
	}

	/**
	 * @param alternateContactNumber the alternateContactNumber to set
	 */
	public void setAlternateContactNumber(Integer alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
	}
	

}
