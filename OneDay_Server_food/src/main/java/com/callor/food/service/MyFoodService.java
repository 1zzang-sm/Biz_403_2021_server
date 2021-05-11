package com.callor.food.service;

import java.util.List;

import com.callor.food.model.MyFoodDTO;
import com.callor.food.model.MyFoodVO;

public interface MyFoodService {
	
	public List<MyFoodDTO> selectAll();
	public List<MyFoodDTO> findByFood();
	
	public void insert(MyFoodVO mfVO);
}
