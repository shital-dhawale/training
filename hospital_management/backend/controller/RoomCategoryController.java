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

import com.hospitalmanagement.model.RoomCategory;
import com.hospitalmanagement.service.RoomCategoryService;

@RestController
@RequestMapping("/roomCategory")
public class RoomCategoryController {
	@Autowired
	private RoomCategoryService roomCategoryService;
	
	@GetMapping("/getAll")
	public @ResponseBody List<RoomCategory> getAllRoomCategory(){
		return roomCategoryService.getAllRoomCategory();
		
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<RoomCategory> getRoomCategorybyId(@PathVariable int id){
		RoomCategory roomCategory = roomCategoryService.getRoomCategoryById(id);
		return ResponseEntity.ok().body(roomCategory);
		
	}
	@PostMapping("/save")
	public ResponseEntity<RoomCategory> saveRoomCategory(@RequestBody RoomCategory roomCategory){
		RoomCategory roomCategory1 = roomCategoryService.saveRoomCategory(roomCategory);
		return ResponseEntity.ok().body(roomCategory1);
		
	}
	@PutMapping("/updateById/{id}")
	public ResponseEntity<RoomCategory> updateRoomCategorybyId(@PathVariable int id, @RequestBody RoomCategory roomCategory){
		RoomCategory roomCategory1 = roomCategoryService.getRoomCategoryById(id);
		roomCategory1.setRoomCategoryId(roomCategory.getRoomCategoryId());
		roomCategory1.setRoomCategoryName(roomCategory.getRoomCategoryName());
		roomCategory1.setRoomRate(roomCategory.getRoomRate());
		roomCategory1.setStartDate(roomCategory.getStartDate());
		roomCategory1.setEndDate(roomCategory.getEndDate());
		RoomCategory roomCategory2 = roomCategoryService.saveRoomCategory(roomCategory1);
		return ResponseEntity.ok().body(roomCategory2);
		
	}
	@DeleteMapping("/deleteById/{id}")
	public void deleteRoomCategorybyId(@PathVariable int id) {
		roomCategoryService.deleteRoomCategoryById(id);
	}
}
