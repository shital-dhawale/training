package com.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.model.Doctor;
import com.hospitalmanagement.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/getAll")
	public @ResponseBody List<Doctor> getAllDoctor(){
		return doctorService.getAllDoctor();
		
	}
	@GetMapping("/getById/{doctorId}")
	public ResponseEntity<Doctor> getDoctorbyId(@PathVariable int doctorId){
		Doctor doctor = new Doctor();
		doctor = doctorService.getDoctorById(doctorId);
		return ResponseEntity.ok().body(doctor);
	}
	@DeleteMapping("/deleteById/{doctorId}")
	public void deleteDoctorbyId(@PathVariable int doctorId) {
		doctorService.deleteDoctorById(doctorId);
	}
	@PostMapping("/save")
	public ResponseEntity<Doctor> saveDoctor(Doctor doctor){
		Doctor doctor1 = new Doctor();
		doctor1 = doctorService.saveDoctor(doctor);
		return ResponseEntity.ok().body(doctor1);
	}
	@PutMapping("/updateById/{doctorId}")
	public ResponseEntity<Doctor> updateDoctorById(@PathVariable int doctorId, @RequestBody Doctor doctor){
		Doctor doctor1 = doctorService.getDoctorById(doctorId);
		doctor1.setDoctorId(doctor.getDoctorId());
		doctor1.setDoctorName(doctor.getDoctorName());
		Doctor doctor2 = doctorService.saveDoctor(doctor1); 
		return ResponseEntity.ok().body(doctor2);
		
	}
	
}
