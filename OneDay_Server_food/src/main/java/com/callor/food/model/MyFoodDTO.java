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
public class MyFoodDTO {

	private String mf_date;
	private String fd_name;
	private String mf_intake;
	private Integer fd_volume;
	private Integer fd_kcal;
	private Integer fd_protein;
	private Integer fd_roll;
	private Integer fd_cbhd;
	private Integer fd_sugar;
}
