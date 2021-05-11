package com.callor.food.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FoodVO {
	
	private String fd_code;
	private String fd_name;
	private String fd_year;
	private String fd_ccode;
	private String fd_vcode;
	private Integer fd_offer = 0;
	private Integer fd_volume = 0;
	private Integer fd_kcal = 0;
	private Integer fd_protein = 0;
	private Integer fd_roll = 0;
	private Integer fd_cbhd = 0;
	private Integer fd_sugar = 0;
	

}
