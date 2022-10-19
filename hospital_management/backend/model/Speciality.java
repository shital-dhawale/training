package com.hospitalmanagement.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "speciality")
public class Speciality {
	@Id
	@Column(name = "specialityId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int specialityId;
	
	@Column(name = "specialityName")
	private String specialityName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doctorId")
	private Doctor doctor;

//	@ManyToMany(mappedBy = "speciality", cascade = { CascadeType.ALL })
//	private List<Hospital> hospitalList;

	public int getSpecialityId() {
		return specialityId;
	}

	public void setSpecialityId(int specialityId) {
		this.specialityId = specialityId;
	}

	public String getSpecialityName() {
		return specialityName;
	}

	public void setSpecialityName(String specialityName) {
		this.specialityName = specialityName;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Speciality [specialityId=" + specialityId + ", specialityName=" + specialityName + ", doctor=" + doctor
				+ "]";
	}

	public Speciality(int specialityId, String specialityName, Doctor doctor) {
		super();
		this.specialityId = specialityId;
		this.specialityName = specialityName;
		this.doctor = doctor;
	}

	public Speciality() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public List<Hospital> getHospitalList() {
//		return hospitalList;
//	}
//
//	public void setHospitalList(List<Hospital> hospitalList) {
//		this.hospitalList = hospitalList;
//	}

}
