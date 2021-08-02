package com.skilldistillery.foodtruck.app;


public class FoodTruckTester {
  public static void main(String[] args) {
    // Create two trucks and assign fields
    FoodTruck truck1 = new FoodTruck(92, "Hermano Spice Bois","Tacos",3);
    FoodTruck truck2 = new FoodTruck( 42,"Y'd Ice Cream", "Dessert", 5);
    // Have the truck display themselves
    truck1.displayTruck();
    System.out.println();
    truck2.displayTruck();
    String truck1Data = truck1.getFoodTruckData();
    String truck2Data = truck2.getFoodTruckData();
    // Get the trucks data and display that
//    System.out.println(" Truck 1 data: " + truck1Data);
//    System.out.println(" Truck 2 data: " + truck2Data);
  }
}