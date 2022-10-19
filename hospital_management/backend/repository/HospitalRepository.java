package com.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalmanagement.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
