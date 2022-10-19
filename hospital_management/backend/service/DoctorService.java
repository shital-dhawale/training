package com.hospitalmanagement.service;

import java.util.List;

import com.hospitalmanagement.model.Doctor;

public interface DoctorService {
	public Doctor saveDoctor(Doctor doctor);
	public List<Doctor> getAllDoctor(); 
	public Doctor getDoctorById(int doctorId);
	public void deleteDoctorById(int doctorId);
}
