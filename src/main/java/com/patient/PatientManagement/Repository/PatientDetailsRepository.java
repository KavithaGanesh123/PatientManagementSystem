package com.patient.PatientManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patient.PatientManagement.Entity.Patient;


@Repository

public interface PatientDetailsRepository extends JpaRepository<Patient, Long>{
	
	

}
