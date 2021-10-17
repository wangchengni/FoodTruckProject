package com.skilldistillery.foodtuck;

public class FoodTruck {
//name,foodtype,rating,
//	truck id(which will be generated constructor from
//	a static field that is increment as each truck is created
	
	private static int nextId = 10001;
	private int fodTruckId;
	private String fodTruckName;
	private String foodType;
	private int ratingNum;
	public FoodTruck() {};
	
	public   FoodTruck(String fodTruckName,String foodType,
						int ratingNum) {
		this.fodTruckId = nextId++;
		this.fodTruckName =fodTruckName;
		this.foodType = foodType;
		this.ratingNum = ratingNum;
//		getArray();
	}
	 
	 
	@Override
	public String toString() {
		return "FoodTruck [fodTruckId=" + fodTruckId + ", fodTruckName=" + fodTruckName + ", foodType=" + foodType
				+ ", ratingNum=" + ratingNum + "]";
	}

	public int getFodTruckId() {
		return fodTruckId;
	}

	public void setFodTruckId(int fodTruckId) {
		this.fodTruckId = fodTruckId;
	}

	public String getFodTruckName() {
		return fodTruckName;
	}

	public void setFodTruckName(String fodTruckName) {
		this.fodTruckName = fodTruckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRatingNum() {
		return ratingNum;
	}

	public void setRatingNum(int ratingNum) {
		this.ratingNum = ratingNum;
	}

	


	 
		
		
	
	
	
	
	
}
