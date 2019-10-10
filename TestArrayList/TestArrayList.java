import java.util.Scanner;

import jsjf.ArrayUnorderedList;
import jsjf.ListADT;


public class TestArrayList {

	private static Scanner keyScan;

	public static void main(String[] args) {
		ArrayUnorderedList<String> list  = new ArrayUnorderedList<String>();
		showMenu();
		keyScan = new Scanner(System.in);
		String choice = keyScan.nextLine();
		
		while(true) {
			// adds an item onto the front of the list
			if(choice.equalsIgnoreCase("a")) {
				System.out.println("Enter an item to be added to first: ");
				list.addToFront(keyScan.nextLine());
				showListData(list);										}
			
			// adds an item from the end of the list
			else if(choice.equalsIgnoreCase("b")) {
				System.out.println("Enter an item to be added to last: ");
				list.addToRear(keyScan.nextLine());	
				showListData(list);										}
			
			// returns the current item at the front of the list 
			else if(choice.equalsIgnoreCase("f")) {
				System.out.println("Front of list: " + list.first());	}
			
			// returns current item at the end of the list
			else if(choice.equalsIgnoreCase("g")) {
				 System.out.println("End of list: " + list.last());		}	
					
			// displays current queue data
			else if(choice.equalsIgnoreCase("h")) {
				showListData(list);										}
			 	
			// removes the item at the front of the list 
			else if(choice.equalsIgnoreCase("r")) {
				list.removeFirst();								
				showListData(list);										}
				
			// removes the item at the end of the list
			else if(choice.equalsIgnoreCase("s")) {
				list.removeLast();	
				showListData(list);										}
			
			// returns the menu
			else if(choice.equalsIgnoreCase("m")) {
				showMenu();												}
			
			// exits the program
			else if(choice.equalsIgnoreCase("x")) {
				System.out.println("Done");	
				System.exit(0);											}
			
			else { 
				// Error message that appears if a choice is invalid
				System.out.println("Invalid choice. ");
				// displays valid choices 
				showMenu(); }
			choice = keyScan.nextLine(); }
			} //main
	
	public static void showMenu() {
		System.out.println("Menu: \n"
				+ "a add an item first \n"
				+ "b add an item last \n"
				+ "f show first item \n"
				+ "g show last item \n"
				+ "h show list \n"
				+ "r remove first item \n"
				+ "s remove last item \n"
				+ "m show this menu \n"
				+ "x exit");
	}//showMenu
	
	public static <T> void showListData(ListADT<T> list) {
		System.out.println("Stack isEmpty: " + list.isEmpty());
		System.out.println("Size: " + list.size());
		System.out.println("Contents (front to rear): " + list.toString());
	}//showListData
} //TestArrayList class

