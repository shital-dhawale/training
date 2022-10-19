package com.hospitalmanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.model.Hospital;
import com.hospitalmanagement.repository.HospitalRepository;
import com.hospitalmanagement.service.HospitalService;
@Service
public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	private HospitalRepository hospitalRepository;
	
	@Override
	public Hospital saveHospital(Hospital hospital) {
		
		return hospitalRepository.save(hospital);
	}

	@Override
	public List<Hospital> getAllHospital() {
		
		return hospitalRepository.findAll();
	}

	@Override
	public Hospital getHospitalById(int hospitalId) {
		Hospital hospital = new Hospital();
		try {
			hospital = convertToHospital(hospitalRepository.findById(hospitalId));
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Invalid id");
		}
		return hospital;
	}
	public Hospital convertToHospital(Optional<Hospital> hospital) {
		Hospital hospital1 = new Hospital();
		if(hospital!=null) {
			hospital1.setHospital_id(hospital.get().getHospital_id());
			hospital1.setHospitalName(hospital.get().getHospitalName());
			hospital1.setAddress(hospital.get().getAddress());
			hospital1.setSpecialityList(hospital.get().getSpecialityList());
			hospital1.setRoomCategoryList(hospital.get().getRoomCategoryList());
		}
		return hospital1;
	}

	@Override
	public void deleteHospitalById(int hospitalId) {
		hospitalRepository.deleteById(hospitalId);
		
	}

}
