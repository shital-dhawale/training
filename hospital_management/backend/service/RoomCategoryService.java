package com.hospitalmanagement.service;

import java.util.List;

import com.hospitalmanagement.model.RoomCategory;


public interface RoomCategoryService {
	public RoomCategory saveRoomCategory(RoomCategory roomCategory);
	public List<RoomCategory> getAllRoomCategory(); 
	public RoomCategory getRoomCategoryById(int roomCategoryId);
	public void deleteRoomCategoryById(int roomCategoryId);
}
