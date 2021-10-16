package com.skilldistillery.foodtuck;

import java.util.Scanner;

public class FoodTruckApp {
//Scanner,menu
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String fdtName;
		String [] fdtNameAy =null;
		String [][] fdInfo = new String[5][3];
		int foodTruckid = 10001;
		fdtNameAy = new String[5];
		int count =0;
		
		FoodTruck truck = new FoodTruck();
		
		FoodTruck truck1 [] = new FoodTruck[5];
		while(count<5) {
		
		System.out.println("Please enter at most 5 FoodTruck's name: ");
		fdtName = kb.nextLine();
		String quitFD ="quit";
		if (fdtName.equals(quitFD)) {
			break;
		}
		System.out.println("Please enter at most 5 FoodTruck's food type: ");
		String fdType = kb.nextLine();
		System.out.println("Please enter at most 5 FoodTruck's rating: ");
		int fdtRating = kb.nextInt();
			count++;
			foodTruckid++;
			kb.nextLine();
		 truck = new FoodTruck(fdtName,fdType,fdtRating);
		 truck1[count]= truck;
		 
		 }
		
		for (int i =0; i<count; i++) {
			System.out.println("food truck id: "+foodTruckid
					+truck1[count]);
		}
 
		System.out.println("Please choose the following menue:");
		System.out.println("----------------------------------");
		System.out.println("1.List all existing food trucks");
		System.out.println("2.See the average rating of food trucks");
		System.out.println("3.Display the highest-rated food truck");
		System.out.println("4.Quit the program");
		System.out.println("-----------------------------------");
		int Choice = kb.nextInt();
		switch(Choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("Quiting, thank you for using this app");
				break;
		
		
		
		
		
		
		
		
		
		
		
		
		}
		}
}
