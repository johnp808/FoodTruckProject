package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	Scanner kb = new Scanner(System.in);
	private int numFoodTruck;
	private FoodTruck[] trucks = new FoodTruck[5];
	private static int maxTrucks = 5;
	String quit = "quit";

	public static void main(String[] args) {
		FoodTruckApp fTA = new FoodTruckApp();
		fTA.run();

// for loops that go over array!		
// enhanced for loop chapters 
	}

	public void run() {
		greeting();
		makeTruck();
		userMenu();
		goodbye();
		kb.close();
	}

	public void addFoodTruck(FoodTruck truck) {
		trucks[numFoodTruck] = truck;
		numFoodTruck++;
	}

	public void greeting() {
		System.out.println("Hello!");
		System.out.println("Please enter out of the 5 food trucks you may have tried, their names, food types and give them a rating.");
		System.out.println();
	}

	public void userMenu() {

		boolean quit = false;

		while (!quit) {

			System.out.println("---------------------------------------------------");
			System.out.println("---------------------------------------------------");
			System.out.println("---------------------------------------------------");
			System.out.println("---------------------------------------------------");
			System.out.println("-                                                 -");
			System.out.println("-      Please Select From One Of The Choices      -");
			System.out.println("-                                                 -");
			System.out.println("- 1.          * List All Food Trucks *            -");
			System.out.println("-                                                 -");
			System.out.println("- 2.        * Average Food Trucks Ratings *       -");
			System.out.println("-                                                 -");
			System.out.println("- 3.        * Display Highest Rated Truck *       -");
			System.out.println("-                                                 -");
			System.out.println("- 4.                  * Quit *                    -");
			System.out.println("-                                                 -");
			System.out.println("---------------------------------------------------");
			System.out.println("---------------------------------------------------");
			System.out.println("---------------------------------------------------");
			System.out.println("---------------------------------------------------");

			System.out.println("Enter your choice: ");
			int userMenuChoice = kb.nextInt();
			kb.nextLine();
			if (userMenuChoice == 1) {
				for (int i = 0; i < trucks.length; i++) {
					if (trucks[i] != null) {
						System.out.println(trucks[i].toString());

					}
				}
			}
// 						take all the trucks in the arrays ratings and divide them 
//					    by the amount of trucks input
			else if (userMenuChoice == 2) {
				double currentNumber = 0;
				double numTrucks = 0;
				for (int i = 0; i < trucks.length; i++) {
					if (trucks[i] != null) {
						 currentNumber += trucks[i].getRating();
						 numTrucks++; 
					}
				}
				double average = currentNumber / numTrucks;
				System.out.println("You've got " + average + " as the average rating score!");
				System.out.println();
			}
			else if (userMenuChoice == 3) {

				int highestRating = 0;
				FoodTruck highestTruck = new FoodTruck(); 
				for (int i = 0; i < trucks.length; i++) {
					// run through all truck
					if (trucks[i] != null) {
						int currentRating = trucks[i].getRating();						
						if (currentRating > highestRating) {
							highestRating = currentRating;
							highestTruck = trucks[i];
						}
					}

				}
				System.out.println("The Highest Rated Truck: " + highestTruck.toString());
			} 
			  else if (userMenuChoice == 4) {
				quit = true;
				System.out.println();
			}
		}
	}
	
	public void goodbye() {
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("-    GGG          OOOOOOO      OOOOOOO    DDDDDDDD       BBBBBBBB   YYY       YYY  EEEEEEEEEE -");
		System.out.println("-  GG  GGG        OOOOOOO      OOOOOOO    DDDDDDDD       BBBBBBBBB   YYY     YYY   EEEEEEEEEE -");
		System.out.println("-  GG   GGG     OO       OO  OO       OO  DD    DDDD     BB   BBBBB   YYY   YYY    EE      EE -");
		System.out.println("-  GG           OO       OO  OO       OO  DD     DDDD    BB    BBBB    YYY YYY     EEE     EE -");
		System.out.println("-  GG  GGGGGGG  OO       OO  OO       OO  DD       DDDD  BBBBBBBBB      YYYYY      EEEEE      -");
		System.out.println("-  GG    GG     OO       OO  OO       OO  DD     DDDD    BB    BBBB     YYYYY      EEE     EE -");
		System.out.println("-  GG   GG      OO       OO  OO       OO  DD    DDDD     BB   BBBBB     YYYYY      EE      EE -");
		System.out.println("-  GGGGGG         OOOOOOO      OOOOOOO    DDDDDDDD       BBBBBBBBB      YYYYY      EEEEEEEEEE -");
		System.out.println("-   GGGG          OOOOOOO      OOOOOO0    DDDDDDDD       BBBBBBBB       YYYYY      EEEEEEEEEE -");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------");
	}

// 		make a new truck after making greeting
	public void makeTruck() {
//	loop this method for 5 truck OR if the user types Quit
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter a food truck name or quit to exit: ");
			String quitOut = kb.nextLine();
			if (quitOut.equalsIgnoreCase(quit)) {

				break;
			} 
			
			else {

				FoodTruck makeFoodTruck;
				String foodTruckName = quitOut;
				System.out.println("Type of food sold here: ");
				String foodType = kb.nextLine();
				System.out.println("Give it a rating out of 5: ");
				int rating = kb.nextInt();
				kb.nextLine();
				System.out.println();
				makeFoodTruck = new FoodTruck(foodTruckName, foodType, rating);
// add the new trucks into an array
				trucks[i] = makeFoodTruck;

			}
		}
	}
}
