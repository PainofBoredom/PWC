package com.miniapp;

public class IndianRestaurant implements Restaurant {

	@Override
	public String prepareFood(String dishName) {
		return "preparing " + dishName + " with indian spices";
	}
	
	
	

}
