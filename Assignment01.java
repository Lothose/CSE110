// CSE 110     : 2020FallA-X-CSE110-75326-76231 
// Assignment  : Assignment 01
// Author      : Brandon Billmeyer & 1220167299
// Description : Program to determine the split of a pizza among adults and children using input from user. 

import java.util.Scanner;

public class Assignment01 {    
	public static void main(String[] args) {          
		
		//Declare and initiate a Scanner  
		Scanner input = new Scanner(System.in);
		
		//Variables that are obtained via user input by the scanner 
		//Number of pizzas purchased
		int numberPizzaPurchased = 0;
		//Number of slices per pizza
		int numberSlicesPerPizza = 0;
		//Number of adults
		int numberAdults = 0;
		//Number of children
		int numberChildren = 0;
		
		//variables declared for storage awaiting computation completion
		//Total number of slices per pizza
		int totalSlices = 0;
		//Total number of slices that will be given to the adults
		int totalSlicesAdult = 0;
		//Total number of slices available for the children
		int totalAvailableChild = 0;
		//Number of slices each child will get
		int totalSlicesChild = 0;
		//Number of slices left over
		int leftover = 0;
		
		// prompt for and collect inputs on same line using format specifiers to align input. 
		System.out.printf("%s %1s" , "Please enter number of pizzas purchased" , ": ");
		numberPizzaPurchased = input.nextInt();
		System.out.printf("%s %6s" , "Please enter number of slices pizza" , ": ");
		numberSlicesPerPizza = input.nextInt();
		System.out.printf("%s %12s" , "Please enter number of adults" , ": ");
		numberAdults = input.nextInt();
		System.out.printf("%s %10s" , "Please enter number of children" , ": ");
		numberChildren = input.nextInt();
		
		//Total slices is equal to number of pizzas multiplied by number of slices
		totalSlices = numberPizzaPurchased * numberSlicesPerPizza;
		//Every adult gets 2 slices of pizza. 
		totalSlicesAdult = numberAdults * 2;
		//Total available to children is total slices minus the total given to adults
		totalAvailableChild = totalSlices - totalSlicesAdult;
		//Each child gets an equal amount of the remaining slices with no splitting. 
		totalSlicesChild = totalAvailableChild / numberChildren;
		/*Remainder of pieces that could not equally be split is obtained by multiplying how many pieces a child 
		will get by number of children. Then subtracting from the total. */
		leftover = totalAvailableChild - (totalSlicesChild * numberChildren);
		
		// display required outputs using format specifiers to align output and start a new line.
		System.out.printf("%s %15s %d%n" , "Total number of slices of pizza" , ":" , totalSlices);
		System.out.printf("%s %8s %d%n" , "Total number of slices given to adults" , ":" , totalSlicesAdult);
		System.out.printf("%s %s %d%n" , "Total number of slices available for children", ":" , totalAvailableChild);
		System.out.printf("%s %4s %d%n" , "Total number of slices each child will get" , ":" , totalSlicesChild);
		System.out.printf("%s %14s %d%n" , "Total number of slices left over" , ":" , leftover);
		{
			//close scanner to stop resource leak warning
			input.close();
		}
	}
}