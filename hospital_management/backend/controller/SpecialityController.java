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

import com.hospitalmanagement.model.Speciality;
import com.hospitalmanagement.service.SpecialityService;

@RestController
@RequestMapping("/speciality")
public class SpecialityController {
	@Autowired
	private SpecialityService specialityService;
	
	@GetMapping("/getAll")
	public @ResponseBody List<Speciality> getAllSpeciality(){
		return specialityService.getAllSpeciality();
		
	}
	@GetMapping("/getById/{specialityId}")
	public ResponseEntity<Speciality> getSpecialitybyId(@PathVariable int specialityId){
		Speciality speciality = specialityService.getSpecialityById(specialityId);
		return ResponseEntity.ok().body(speciality);
		
	}
	@PostMapping("/save")
	public ResponseEntity<Speciality> saveSpeciality(@RequestBody Speciality speciality){
		Speciality speciality1 = specialityService.saveSpeciality(speciality);
		return ResponseEntity.ok().body(speciality1);
		
	}
	@DeleteMapping("/deleteById/{specialityId}")
	public void deleteSpecialityById(@PathVariable int specialityId) {
		specialityService.deleteSpecialityById(specialityId);
	}
	@PutMapping("/updateById/{id}")
	public ResponseEntity<Speciality> updateSpecialitybyId(@PathVariable int id, @RequestBody Speciality speciality){
		Speciality speciality1 = specialityService.getSpecialityById(id);
		speciality1.setSpecialityId(speciality.getSpecialityId());
		speciality1.setSpecialityName(speciality.getSpecialityName());
		speciality1.setDoctor(speciality.getDoctor());
		Speciality speciality2 = specialityService.saveSpeciality(speciality1);
		return ResponseEntity.ok().body(speciality2);
		
	}
	
	
}
