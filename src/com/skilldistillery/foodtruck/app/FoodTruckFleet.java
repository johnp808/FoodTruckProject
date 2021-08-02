package com.skilldistillery.foodtruck.app;

public class FoodTruckFleet {
// define variables for the array of trucks
	
	
	private FoodTruckFleet() {
		trucks = new FoodTruck[maxTrucks];
	}
// 
	

	public int getNumFoodTruck() {
		return numFoodTruck;
	}

	public void setNumFoodTruck(int numFoodTruck) {
		this.numFoodTruck = numFoodTruck;
	}

	@Override
	public String toString() {
		return 
	"FoodTrucks [numFoodTruck= " + numFoodTruck + ", Max # of Food Trucks= " + " " + trucks.length + "]";
	}

	public static int getMaxTrucks() {
		return maxTrucks;
	}

	public static void setMaxTrucks(int maxTrucks) {
		FoodTruckFleet.maxTrucks = maxTrucks;
	}
	
	
}
