package com.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalmanagement.model.RoomCategory;

public interface RoomCategoryRepository extends JpaRepository<RoomCategory, Integer>{

}
