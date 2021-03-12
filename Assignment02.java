// CSE 110     : 2020FallA-X-CSE110-75326-76231 
// Assignment  : Assignment02
// Author      : Brandon Billmeyer 1220167299
// Description : Program used to find total materials and cost for a road construction project given area of road, pipe requirements, and stoplight needs. 

import java.util.Scanner;

public class Assignment02 {    
	public static void main(String[] args) {        
		// declare and instantiate a Scanner  
		Scanner input = new Scanner(System.in);
		
		//Variables that are obtained via user input by the scanner 
		//Length of road project (miles)
		double lengthRoadMiles = 0;
		//Number of lanes
		int numberLanes = 0;
		//Depth of asphalt (inches)
		int depthAsphaltIn = 0;
		//Days to complete project
		int daysToComplete;
		
		//variables declared for storage awaiting computation completion
		//Rounded Truckloads of Asphalt
		int roundedTruckloadsAsphalt = 0;
		//Stoplights
		int stoplights = 0;
		//Rounded Conduit Pipes
		int roundedConduitPipes = 0;
		//Rounded Crew members
		int roundedCrewMembers = 0;
		//Cost of Asphalt
		int costOfAsphalt = 0;
		//Cost of Stoplights
		int costOfStoplights = 0;
		//Cost of Conduit
		int costOfConduit = 0;
		//Cost of Labor
		int costOfLabor = 0;
		//Total cost
		int totalCost = 0;
		
		//Double variables needed for rounding if statement below
		//Truckloads of Asphalt
		double truckloadsAsphalt = 0;
		//Conduit Pipes
		double conduitPipes = 0;
		//Crew members
		double crewMembers = 0;
		
		//Final variable of cost per truck of Asphalt
		final int ASPHALTCOSTPERTRUCK = 200*5;
	
		
		// prompt for and collect inputs on same line using format specifiers to align input. 
		System.out.printf("%s %1s" , "Length of road project (miles)" , ": ");
		lengthRoadMiles = input.nextDouble();
		
		System.out.printf("%s %17s" , "Number of lanes" , ": ");
		numberLanes = input.nextInt();
		
		System.out.printf("%s %7s" , "Depth of asphalt (inches)" , ": ");
		depthAsphaltIn = input.nextInt();
		
		System.out.printf("%s %8s" , "Days to complete project" , ": ");
		daysToComplete = input.nextInt();
		
		/*Convert miles to feet, total feet for lanes entered, and inches to feet for depth. Multiply to get cubic feet. 
		Multiply by 150 to get total weight and divide by truck capacity 10,000 lbs*/
		truckloadsAsphalt = ((lengthRoadMiles*5280)*(numberLanes*12)*(depthAsphaltIn/12.00))*150/10000;
		//Use if statement to verify that part of a truck gets rounded up. Even if truck is below .5 then writing int to rounded total.
		if (truckloadsAsphalt % 1 != 0) { 	
			truckloadsAsphalt++;
			roundedTruckloadsAsphalt = (int)truckloadsAsphalt; 
			}
			else {
				roundedTruckloadsAsphalt = (int)truckloadsAsphalt;
			}
		//Total stoplights are 2 lights per every COMPLETE mile of road and one additional light per lane at an intersection. 
		stoplights = ((int)lengthRoadMiles*2) + ((int)lengthRoadMiles*numberLanes) ;
		//Convert miles to feet and divide by 24 foot each conduit section is. 
		conduitPipes = (lengthRoadMiles*5280) / 24;
		//Use if statement to verify that part of a conduit gets rounded up. Even if conduit is below .5 then writing int to rounded total.
		if (conduitPipes % 1 != 0) {
			conduitPipes++;
			roundedConduitPipes = (int)conduitPipes; 
			}
			else {
				roundedConduitPipes = (int)conduitPipes;
			}
		//Crew member equation supplied in assignment 50 times miles times lanes divided by days equals number of crew members. 
		crewMembers = (50 * lengthRoadMiles * numberLanes) / daysToComplete;
		//Use if statement to verify that part of crew member gets rounded up. Even if crew member is below .5 then writing int to rounded total.
		if (crewMembers % 1 != 0) {
			crewMembers++;
			roundedCrewMembers = (int)crewMembers; 
			}
			else {
				roundedCrewMembers = (int)crewMembers;
			}
		//cost of asphalt is cost per truck multiplied by rounded trucks total
		costOfAsphalt = ASPHALTCOSTPERTRUCK*roundedTruckloadsAsphalt; 
		//stoplights are 25000 a piece
		costOfStoplights = stoplights * 25000;
		//cost of conduit based on rounded total needed times 500 per section.
		costOfConduit = (int)(roundedConduitPipes*500);
		/*cost of labor based on each total crew members being available for 8 hrs per day making 25 dollars per hr 
		multiplied by number of days to complete.*/ 
		costOfLabor = (int)(((roundedCrewMembers*8)*25)*daysToComplete);
		//Total cost is obtained by all cost categories added together
		totalCost = costOfAsphalt + costOfStoplights + costOfConduit + costOfLabor;
		
		//Display required outputs using format specifiers to align output and start a new line. 
		System.out.printf("%s%n" , "=== Amount of materials needed ===");
		System.out.printf("%s %1s %d%n" , "Truckloads of Asphalt" , ":" , roundedTruckloadsAsphalt);
		System.out.printf("%s %12s %d%n", "Stoplights" , ":" , stoplights);
		System.out.printf("%s %9s %d%n", "Conduit pipes" , ":" , roundedConduitPipes);
		System.out.printf("%s %3s %d%n", "Crew members needed" , ":" , roundedCrewMembers);
		System.out.printf("%s%n" , "=== Cost of Materials ============");
		/*Display required outputs using format specifiers to align output and start a new line. 
		Use (double) to cast int to double for display of ".00" at end of costs. */
		System.out.printf("%s %7s $%.2f%n" , "Cost of Asphalt" , ":" , (double)costOfAsphalt);
		System.out.printf("%s %4s $%.2f%n" , "Cost of Stoplights" , ":" , (double)costOfStoplights);
		System.out.printf("%s %1s $%.2f%n" , "Cost of Conduit pipes" , ":" , (double)costOfConduit);
		System.out.printf("%s %9s $%.2f%n" , "Cost of Labor" , ":" , (double)costOfLabor);
		System.out.printf("%s%n" , "=== Total Cost of Project ========");
		System.out.printf("%s %1s $%.2f%n" , "Total cost of project" ,   ":" , (double)totalCost);
		{
			//close scanner to stop resource leak warning
			input.close();
		}
	}
}
