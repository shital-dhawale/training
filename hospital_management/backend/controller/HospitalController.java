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

import com.hospitalmanagement.model.Hospital;
import com.hospitalmanagement.service.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping("/getAll")
	public @ResponseBody List<Hospital> getAllHospital(){
		return hospitalService.getAllHospital();
		
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<Hospital> getHospitalbyId(@PathVariable int id){
		Hospital hospital = hospitalService.getHospitalById(id);
		return ResponseEntity.ok().body(hospital);
		
	}
	@PostMapping("/save")
	public ResponseEntity<Hospital> saveHospital(@RequestBody Hospital hospital){
		Hospital hospital1 = hospitalService.saveHospital(hospital);
		return ResponseEntity.ok().body(hospital1);
		
	}
	@DeleteMapping("deleteById/{id}")
	public void deleteHospitalbyId(@PathVariable int id) {
		hospitalService.deleteHospitalById(id);
	}
	@PutMapping("/updateById/{id}")
	public ResponseEntity<Hospital> updateHospitalbyId(@PathVariable int id, @RequestBody Hospital hospital){
		Hospital hospital1 = hospitalService.getHospitalById(id);
		hospital1.setHospital_id(hospital.getHospital_id());
		hospital1.setHospitalName(hospital.getHospitalName());
		hospital1.setAddress(hospital.getAddress());
		hospital1.setSpecialityList(hospital.getSpecialityList());
		hospital1.setRoomCategoryList(hospital.getRoomCategoryList());
		Hospital hospital2 = hospitalService.saveHospital(hospital1);
		return ResponseEntity.ok().body(hospital2);
		
	}
}
