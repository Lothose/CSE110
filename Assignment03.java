// CSE 110     : 2020FallA-X-CSE110-75326-76231 
// Assignment  : Assignment03
// Author      : Brandon Billmeyer & 1220167299
// Description : A program utilizing if statements to determine the purchase, sale or hold of stocks pased on input from the user. 

// Import Scanner class
import java.util.Scanner;

public class Assignment03 {    
	public static void main(String[] args) {        
		// declare and instantiate a Scanner     
		Scanner scan = new Scanner(System.in);
		// declare variables required by user input
		int currentShares = 0;
		int purchasePrice = 0;
		int marketPrice = 0;
		int availableFunds = 0;
		
		//Declare variables needed to perform calculations
		final int TRANSACTIONFEE = 10;
		int totalBuyCost = 0;
		int numberOfSharesToBuy = 0;
		int perShareBuyValue = 0;
		int totalBuyValue = 0;
		int perShareSellValue = 0;
		int totalSellValue = 0;
		
		// prompt for and collect inputs    
		System.out.printf("%s %3S" , "Current Shares" , ": ");
		currentShares = scan.nextInt();
		System.out.printf("%s %3s" , "Purchase Price" , ": ");
		purchasePrice = scan.nextInt();
		System.out.printf("%s %5s" , "Market Price" , ": ");
		marketPrice = scan.nextInt();
		System.out.printf("%s %s" , "Available Funds" ,": ");
		availableFunds = scan.nextInt();
		
		// compute required values.
		//Total cost to buy
		totalBuyCost = TRANSACTIONFEE + (marketPrice * numberOfSharesToBuy);
		//Number of shares to by if available funds after fee.
		numberOfSharesToBuy = (int) Math.floor((availableFunds-TRANSACTIONFEE)/marketPrice);
		//Value of shares to buy
		perShareBuyValue = purchasePrice - marketPrice;
		//total value to buy with available funds
		totalBuyValue = perShareBuyValue * numberOfSharesToBuy;
		//value of shares to sell
		perShareSellValue = marketPrice - purchasePrice;
		//total value of on hand shares
		totalSellValue = perShareSellValue * currentShares;
		
		// if statement dedicated to selling. If value of share is greater to the market
		if (purchasePrice < marketPrice) {
			//and shares value is greater than transaction fee
			if (totalSellValue > TRANSACTIONFEE) {
			//sell shares
			System.out.println("Sell " + currentShares + " shares");
			//if value is less than transaction fee hold
			} else {
			System.out.println("Hold shares");
			} 
		} 
		//if statement dedicated to buying if market price is lower than purchase
		if (purchasePrice > marketPrice) {
			//if buy value is greater than cost buy
			if (totalBuyValue > totalBuyCost) {
				System.out.println("Buy " + numberOfSharesToBuy + " shares");
			//if value is not greater than cost to buy hold. 
			} else {
				System.out.println("Hold shares");
			}
		}
		//close scanner
		scan.close();
	}
}

	
