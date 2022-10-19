package com.hospitalmanagement.service;

import java.util.List;

import com.hospitalmanagement.model.Hospital;


public interface HospitalService {
	
		public Hospital saveHospital(Hospital hospital);
		public List<Hospital> getAllHospital(); 
		public Hospital getHospitalById(int hospitalId);
		public void deleteHospitalById(int hospitalId);

}
