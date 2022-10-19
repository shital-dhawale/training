package com.hospitalmanagement.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "room_category")
public class RoomCategory {
	@Id
	@Column(name = "roomCategoryId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomCategoryId;

	@Column(name = "roomCategoryName")
	private String roomCategoryName;

	@Column(name = "roomRate")
	private double roomRate;

	@Column(name = "startDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String startDate;

	@Column(name = "endDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String endDate;

	public int getRoomCategoryId() {
		return roomCategoryId;
	}

	public void setRoomCategoryId(int roomCategoryId) {
		this.roomCategoryId = roomCategoryId;
	}

	public String getRoomCategoryName() {
		return roomCategoryName;
	}

	public void setRoomCategoryName(String roomCategoryName) {
		this.roomCategoryName = roomCategoryName;
	}

	public double getRoomRate() {
		return roomRate;
	}

	public void setRoomRate(double roomRate) {
		this.roomRate = roomRate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "RoomCategory [roomCategoryId=" + roomCategoryId + ", roomCategoryName=" + roomCategoryName
				+ ", roomRate=" + roomRate + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	public RoomCategory(int roomCategoryId, String roomCategoryName, double roomRate, String startDate,
			String endDate) {
		super();
		this.roomCategoryId = roomCategoryId;
		this.roomCategoryName = roomCategoryName;
		this.roomRate = roomRate;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public RoomCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

}
