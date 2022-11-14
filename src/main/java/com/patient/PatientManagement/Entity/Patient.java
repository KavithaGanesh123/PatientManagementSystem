package com.patient.PatientManagement.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.patient.PatientManagement.SchemaObjects.AddressListSO;

@Entity
@Table(name = "PATIENT_HDR")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patient_id")
	
	private long patient_id;
	
	private String patientName;
	
	private Date patientDOB;
	
	private Integer patientAadharNum;
	
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "patientAddress", fetch = FetchType.LAZY)
	
	private List<PatientAddress> patientAddresses;
	
	
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

	/**
	 * @return the patient_id
	 */
	public long getPatient_id() {
		return patient_id;
	}

	/**
	 * @param patient_id the patient_id to set
	 */
	public void setPatient_id(long patient_id) {
		this.patient_id = patient_id;
	}

	/**
	 * @return the patientAddresses
	 */
	public List<PatientAddress> getPatientAddresses() {
		return patientAddresses;
	}

	/**
	 * @param patientAddresses the patientAddresses to set
	 */
	public void setPatientAddresses(List<PatientAddress> patientAddresses) {
		this.patientAddresses = patientAddresses;
	}

}
