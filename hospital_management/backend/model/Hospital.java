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
import jakarta.persistence.Table;
@Entity
@Table(name="hospital")
public class Hospital {
	@Id
	@Column(name="hospital_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int hospital_id;
	@Column(name="hospitalName")
	private String hospitalName;
	@Column(name="address")
	private String address;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="specialityId")
	List<Speciality> specialityList;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="roomCategoryId")
	private List<RoomCategory> roomCategoryList;
	
	
	public int getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(int hospital_id) {
		this.hospital_id = hospital_id;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Speciality> getSpecialityList() {
		return specialityList;
	}
	public void setSpecialityList(List<Speciality> specialityList) {
		this.specialityList = specialityList;
	}
	public List<RoomCategory> getRoomCategoryList() {
		return roomCategoryList;
	}
	public void setRoomCategoryList(List<RoomCategory> roomCategoryList) {
		this.roomCategoryList = roomCategoryList;
	}
	public Hospital(int hospital_id, String hospitalName, String address, List<Speciality> specialityList,
			List<RoomCategory> roomCategoryList) {
		super();
		this.hospital_id = hospital_id;
		this.hospitalName = hospitalName;
		this.address = address;
		this.specialityList = specialityList;
		this.roomCategoryList = roomCategoryList;
	}
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hospital [hospital_id=" + hospital_id + ", hospitalName=" + hospitalName + ", address=" + address
				+ ", specialityList=" + specialityList + ", roomCategoryList=" + roomCategoryList + "]";
	}
	
	
	
}
