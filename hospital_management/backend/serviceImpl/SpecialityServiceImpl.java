package com.hospitalmanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.model.Speciality;
import com.hospitalmanagement.repository.SpecialityRepository;
import com.hospitalmanagement.service.SpecialityService;
@Service
public class SpecialityServiceImpl implements SpecialityService{
	@Autowired
	private SpecialityRepository specialityRepository;
	@Override
	public Speciality saveSpeciality(Speciality speciality) {
		
		return specialityRepository.save(speciality);
	}

	@Override
	public List<Speciality> getAllSpeciality() {
		
		return specialityRepository.findAll();
	}

	@Override
	public Speciality getSpecialityById(int specialityId) {
		Speciality speciality1 = new Speciality();
		try {
			speciality1 = convertToSpeciality(specialityRepository.findById(specialityId));
		}catch(Exception e) {
			
		}
		return speciality1;
	}
	public Speciality convertToSpeciality(Optional<Speciality> speciality) {
		Speciality speciality1 = new Speciality();
		if(speciality!=null) {
			speciality1.setSpecialityId(speciality.get().getSpecialityId());
			speciality1.setSpecialityName(speciality.get().getSpecialityName());
			speciality1.setDoctor(speciality.get().getDoctor());
		}
		return speciality1;
	}

	@Override
	public void deleteSpecialityById(int specialityId) {
		specialityRepository.deleteById(specialityId);
		
	}

}
