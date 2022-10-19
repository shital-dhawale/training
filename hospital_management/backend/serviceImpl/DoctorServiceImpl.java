package com.hospitalmanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.model.Doctor;
import com.hospitalmanagement.repository.DoctorRepository;
import com.hospitalmanagement.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	private DoctorRepository doctorRepository;
	@Override
	public Doctor saveDoctor(Doctor doctor) {
		
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getAllDoctor() {
		
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(int doctorId) {
		Doctor doctor1 = new Doctor();
		try {
			doctor1 = convertToDoctor(doctorRepository.findById(doctorId));
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Invalid doctor id");
		}
		
		return doctor1;
	}
	public Doctor convertToDoctor(Optional<Doctor> doctor) {
		Doctor doctor1 = new Doctor();
		if(doctor!=null) {
			doctor1.setDoctorId(doctor.get().getDoctorId());
			doctor1.setDoctorName(doctor.get().getDoctorName());
		}
		return doctor1;
	}

	@Override
	public void deleteDoctorById(int doctorId) {
		doctorRepository.deleteById(doctorId);
		
	}

}
