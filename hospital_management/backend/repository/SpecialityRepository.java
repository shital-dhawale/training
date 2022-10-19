package com.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.model.Speciality;
@Repository
public interface SpecialityRepository extends JpaRepository<Speciality, Integer>{

}
