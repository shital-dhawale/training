package com.hospitalmanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.model.RoomCategory;
import com.hospitalmanagement.repository.RoomCategoryRepository;
import com.hospitalmanagement.service.RoomCategoryService;
@Service
public class RoomCategoryServiceImpl implements RoomCategoryService{
	@Autowired
	private RoomCategoryRepository roomCategoryRepository;
	@Override
	public RoomCategory saveRoomCategory(RoomCategory roomCategory) {
		
		return roomCategoryRepository.save(roomCategory);
	}

	@Override
	public List<RoomCategory> getAllRoomCategory() {
		
		return roomCategoryRepository.findAll();
	}

	@Override
	public RoomCategory getRoomCategoryById(int roomCategoryId) {
		
		return null;
	}
	public RoomCategory convertToRoomCategory(Optional<RoomCategory> roomCategory) {
		RoomCategory roomCategory1 = new RoomCategory();
		if(roomCategory!=null) {
			roomCategory1.setRoomCategoryId(roomCategory.get().getRoomCategoryId());
			roomCategory1.setRoomCategoryName(roomCategory.get().getRoomCategoryName());
			roomCategory1.setRoomRate(roomCategory.get().getRoomRate());
			roomCategory1.setStartDate(roomCategory.get().getStartDate());
			roomCategory1.setEndDate(roomCategory.get().getEndDate());
			
		}
		return roomCategory1;
	}

	@Override
	public void deleteRoomCategoryById(int roomCategoryId) {
		roomCategoryRepository.deleteById(roomCategoryId);
		
	}

}
