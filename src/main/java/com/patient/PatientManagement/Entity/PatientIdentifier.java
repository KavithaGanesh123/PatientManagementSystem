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
@Table(name = "PATIENT_IDENTIFIER")
public class PatientIdentifier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patientItentifier_id")
	
	private long patientItentifier_id;
	
	private String identifier_type;
	
	private String identifier_number;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({ @JoinColumn(name = "patient_id", referencedColumnName = "patient_id", nullable = false) })
    private Patient patient;

	public long getPatientItentifier_id() {
		return patientItentifier_id;
	}

	public void setPatientItentifier_id(long patientItentifier_id) {
		this.patientItentifier_id = patientItentifier_id;
	}

	public String getIdentifier_type() {
		return identifier_type;
	}

	public void setIdentifier_type(String identifier_type) {
		this.identifier_type = identifier_type;
	}

	public String getIdentifier_number() {
		return identifier_number;
	}

	public void setIdentifier_number(String identifier_number) {
		this.identifier_number = identifier_number;
	}

}
