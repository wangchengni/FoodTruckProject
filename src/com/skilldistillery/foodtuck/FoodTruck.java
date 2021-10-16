package com.skilldistillery.foodtuck;

public class FoodTruck {
//name,foodtype,rating,
//	truck id(which will be generated constructor from
//	a static field that is increment as each truck is created
	
	
	private int fodTrucjId;
	private String fodTruckName;
	private String foodType;
	private int ratingNum;
	public FoodTruck() {};
	
	public   FoodTruck(String fodTruckName,String foodType,
						int ratingNum) {
		this.fodTruckName =fodTruckName;
		this.foodType = foodType;
		this.ratingNum = ratingNum;
	}
	public String getData() {
		String output = "Name: "+fodTruckName+" Food Type: "+foodType
				+" Rating: "+ratingNum;
		return output;
	}
	
	
	
	
	
}
