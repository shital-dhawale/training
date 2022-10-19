package com.hospitalmanagement.service;

import java.util.List;


import com.hospitalmanagement.model.Speciality;

public interface SpecialityService {
	public Speciality saveSpeciality(Speciality speciality);
	public List<Speciality> getAllSpeciality(); 
	public Speciality getSpecialityById(int specialityId);
	public void deleteSpecialityById(int specialityId);
}
