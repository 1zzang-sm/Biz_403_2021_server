package com.callor.food.service;

import java.util.List;

import com.callor.food.model.FoodDTO;
import com.callor.food.model.FoodVO;

public interface FoodService {
	
	public List<FoodDTO> selectAll();
	public List<FoodDTO> findByCode(String fd_ccode);
	
	public void insert(FoodVO foodVO);
	

}
