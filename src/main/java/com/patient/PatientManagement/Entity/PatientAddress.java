package com.patient.PatientManagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT_ADDRESS")
public class PatientAddress {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patientadr_id")
	
	private long patientadr_id;
	
	private String address_line1;
	private String address_line2;
	
	private String state;
	
	private String country;
	
	private String pincode;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumns({ @JoinColumn(name = "patient_id", referencedColumnName = "patient_id", nullable = false) })
	    private Patient patient;

	/**
	 * @return the address_line1
	 */
	public String getAddress_line1() {
		return address_line1;
	}

	/**
	 * @param address_line1 the address_line1 to set
	 */
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	/**
	 * @return the address_line2
	 */
	public String getAddress_line2() {
		return address_line2;
	}

	/**
	 * @param address_line2 the address_line2 to set
	 */
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the patientadr_id
	 */
	public long getPatientadr_id() {
		return patientadr_id;
	}

	/**
	 * @param patientadr_id the patientadr_id to set
	 */
	public void setPatientadr_id(long patientadr_id) {
		this.patientadr_id = patientadr_id;
	}

	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
