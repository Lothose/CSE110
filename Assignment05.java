// CSE 110     : 2020FallA-X-CSE110-75326-76231 
// Assignment  : Assignment05
// Author      : Brandon Billmeyer & 1220167299
// Description : A number of static methods to perform tasks without user input. 

public class Assignment05 {
	
    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.

    }
    
    // 1) Write (define) a static method named displayGreeting, 
    //  that takes no arguments and returns no value. 
    //  When this function is called, it should print the text "Hello, and welcome!".
    static void displayGreeting() {
    	System.out.println("Hello, and welcome!");
    }
    
    //2) Write (define) a static method named displayText, 
    //  that takes a single String argument and returns no value. 
    //  When this function is called, it should print the value of the argument that was passed to it.
    static void displayText(String a) {
    	System.out.println(a);
    }
    
    //3) Write (define) a static method named printTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should print the sum of the three arguments passed to it. 
    //  This function should return no value.
    static void printTotal(int a, int b, int c) {
    	int sum = a + b + c;
    	System.out.print(sum);
    }
    
    //4) Write (define) a static method named getTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the sum 
    //  of the three arguments passed to it as an int.
    static int getTotal(int a, int b, int c) {
    	int total = a + b + c;
    	return total;
    }
    
    //5) Write (define) a static method named getAverage, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the average 
    //  of the three arguments passed to it as a double.
    static double getAverage(int a, int b, int c) {
    	double average = (a + b + c) / 3.0;
    	return average;
    }
    
    //6) Write (define) a static method named averageLength, 
    //  that takes three String arguments. 
    //  When this function is called, it should return the average length (number of characters) 
    //  of the String arguments passed to it as a double.
    static double averageLength(String a, String b, String c) {
    	int lengthA = a.length();
    	int lengthB = b.length();
    	int lengthC = c.length();
    	double length = (lengthA + lengthB + lengthC) / 3.0;
    	return length;
    }
    
    //7) Write (define) a static method named lengthOfShortest, 
    //  that takes two String arguments. When this function is called, 
    //  it should return the length (number of characters) 
    //  of the shortest String argument passed to it as an int.
    static int lengthOfShortest(String a, String b) {
    	int shortest;
    	if (a.length() > b.length()) {
    		shortest = b.length();
    	} else {
    		shortest = a.length();
    	}
    	return shortest;
    }
    
    //8) Write (define) a static method named stringOfStars, 
    //  that takes one String argument.
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the string argument passed to it.
    static String stringOfStars(String a) {
    	String stars = "*********************";
    	stars = stars.substring(0, a.length());
    	return stars;
    }
    
    //9) Write (define) a static method named maxStringOfStars, 
    //  that takes two String arguments. 
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the longest string argument passed to it.
    static String maxStringOfStars(String a, String b) {
    	int longest;
    	String stars = "*********************";
    	if (a.length() < b.length()) {
    		longest = b.length();
    	} else {
    		longest = a.length();
    	}
    	stars = stars.substring(0, longest);
    	return stars;
    }
    
    //10) Write (define) a static method named midStringOfStars, 
    //   that takes three String arguments. 
    //   When this function is called, it should return a String of asterisks (*) 
    //   that is the same length as the string argument with the length 
    //   that would be in the middle if the lengths of the arguments were arranged in ascending order.
    static String midStringOfStars(String a, String b, String c) {
    	String stars = "*********************";
    	int middle=0;
    	if (a.length() > b.length() && a.length() < c.length()) {
    		middle = a.length();
    	} else if (a.length() > c.length() && a.length() < b.length()) {
    		middle = a.length();
    	} else if (b.length() > a.length() && b.length() < c.length()) {
    		middle = b.length();
    	} else if (b.length() > c.length() && b.length() < a.length()) {
    		middle = b.length();
    	} else if (c.length() > a.length() && c.length() < b.length()) {
    		middle = c.length();
    	} else if (c.length() > b.length() && c.length() < a.length()) {
    		middle = c.length();
    	}
    	stars = stars.substring(0, middle);
    	return stars;
    	}

    }

