package com.skilldistillery.foodtruck.app;

public class FoodTruck {
// input what variables the user will enter
	private int id;
	private String foodTruckName;
	private String foodType;
	private int rating;
	private static int numOfTrucks = 0;

	public FoodTruck() {
	}
	// construct a FoodTruck
	public FoodTruck(String foodTruckName, String foodType, int rating) {
		this.foodTruckName = foodTruckName;
		this.foodType = foodType;
		this.rating = rating;
		numOfTrucks++;
		id = numOfTrucks;
	}
// prints out 
	public String getFoodTruckData() {
		String output = "id: " + id + ", Food truck Name = " + foodTruckName + ", food Type = " + foodType + ", rating = "
				+ rating + " ]";
		return output;
	}
	@Override
	public String toString() {
		return "id: " + id + ", Food trucks name: " + foodTruckName + ", Type of food: " + foodType + ", rating: " + rating;
	}
	public void displayTruck() {
		System.out.println(this);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFoodTruckName() {
		return foodTruckName;
	}
	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public void displayFoodTruck() {
	}
}
