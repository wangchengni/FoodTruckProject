package com.skilldistillery.foodtuck;

import java.util.Scanner;

public class FoodTruckApp {
//Scanner,menu
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FoodTruckApp truckApp = new FoodTruckApp();
		Scanner kb = new Scanner(System.in);
		String fdtName;
		String fdType;
		int fdtRating;
		int count = 0;

		FoodTruck truck = new FoodTruck();

		int numOfTrucks;
		System.out.println("Please tell me how many food trucks do you want to input: ");
		numOfTrucks = kb.nextInt();
		FoodTruck truckArray[] = new FoodTruck[numOfTrucks];

		while (count < numOfTrucks) {
			System.out.println("Give me NO."+(count+1)+" FoodTruck's name: ");

			fdtName = kb.next();
			String quitFD = "quit";
			if (fdtName.equals(quitFD)) {
				break;
			}
			kb.nextLine();
			System.out.println("Please enter the FoodTrucks' food type: ");
			fdType = kb.nextLine();
			System.out.println("Please enter the ratings: ");
			fdtRating = kb.nextInt();

			truck = new FoodTruck(fdtName, fdType, fdtRating);
			truckArray[count] = truck;
			count++;
			kb.nextLine();
			System.out.println();

		}

		System.out.println("Please choose the following menue:");
		System.out.println("----------------------------------");
		System.out.println("1.List all existing food trucks");
		System.out.println("2.See the average rating of food trucks");
		System.out.println("3.Display the highest-rated food truck");
		System.out.println("4.Quit the program");
		System.out.println("-----------------------------------");
		boolean keeploop = true;
		while (keeploop == true) {
			int Choice = kb.nextInt();
			switch (Choice) {
			case 1:
				System.out.println("The following list are the food trucks you input: ");
				for (FoodTruck x : truckArray) {
					System.out.println(x.getFodTruckName());
				}
				System.out.println("Press 2,3 if you want to check others and 4 to quit.");
				break;
			case 2:
				System.out.println("The average rating of these food truck is : ");
				double z = 0;
				double x = 0;
				for (int i = 0; i < truckArray.length; i++) {
					x = truckArray[i].getRatingNum();
					z += x;
				}
				double avgRat = z / numOfTrucks;
				System.out.println(avgRat);
				System.out.println("Press 1,3 if you want to check others and 4 to quit.");
				break;
			case 3:
				System.out.println("The following food truck have the highest rating: ");
				x = 0;
				z = 0;
				double y = 0;
				int i = 0;
				for (i = 0; i < truckArray.length; i++) {
					y = z;
					x = truckArray[i].getRatingNum();

					if (x - y >= 0) {
						z = x;
					} else {
						z = y;
					}
				}
				for (FoodTruck FDTruck : truckArray) {
					if (FDTruck.getRatingNum() == (int) (z)) {
						System.out.println(FDTruck.getFodTruckName());
					}
				}

				System.out.println("Press 1,2 if you want to check others and 4 to quit.");
				break;
			case 4:
				System.out.println("Quiting, thank you for using this app.");
				keeploop = false;
				break;
			}

		}
		kb.close();
	}
}
