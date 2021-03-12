// CSE 110     : 2020FallA-X-CSE110-75326-76231 
// Assignment  : Assignment06
// Author      : Brandon Billmeyer & 1220167299
// Description : A number of array methods to perform tasking without user input


public class Assignment06 {

    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.

    	}
    
    // 1) Write a public static method named printArray, 
    //   that takes two arguments. The first argument is an Array of int 
    //   and the second argument is a String. The method should print out 
    //   a list of the values in the array, each separated by the value of the second argument.
    public static void printArray(int[] array, String str) {
    	for (int i = 0; i < array.length; i++) {
		   if (i > 0) { 
		      System.out.print(str); 
		   }
      	   System.out.print(array[i]);
    	}
    	
    }
    
    // 2) Write a public static method named getFirst, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the first element of the array.
    public static int getFirst(int[] array) {
    	int number = array[0];
    	return number;
    }
    
    // 3) Write a public static method named getLast, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the last element of the array.
    public static int getLast(int[] array) {
    	int last=0;
    	for (int i = 0; i < array.length; i++) {
    		last = array[i];
		}
    	return last;
    }
    
    // 4) Write a public static method named getAllButFirst, 
    //    that takes an Array of int as an argument and creates and returns 
    //    a new array with all of the values in the argument array except the first value.
    public static int[] getAllButFirst(int[] array) {
    	int[] modified = new int[array.length-1];
    	for (int i = 0; i < modified.length; i++)
		{ 
    		modified[i] = array[i+1]; 
		}
    	return modified;
    }
   
    
    // 5) Write a public static method named getIndexOfMin, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the least value in the array.
    public static int getIndexOfMin(int[] array) {
   	 	int index = 0;
    	int min=array[index]; 
    	for (int i=1; i < array.length; i++) {
        	 if (array[i] < min) {
        		min = array[i];
        		index = i;
        	 } 
      	}
    	return index;
    }
    
    // 6) Write a public static method named getIndexOfMax, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the largest value in the array.
    public static int getIndexOfMax(int[] array) {
   	 	int index = 0;
    	int max=array[index]; 
    	for (int i=1; i < array.length; i++) {
        	 if (array[i] > max) {
        		max = array[i];
        		index = i;
        	 } 
      	}
    	return index;
    }
    
    // 7) Write a public static method named swapByIndex, 
    //    that takes three arguments. The first argument is an Array of int, 
    //    and the second and third arguments are int indexes. 
    //    This method will swap the values at the two given index arguments 
    //    in the array, and return a reference to the array.
    public static int[] swapByIndex(int[] array, int index1, int index2) {
    	int temp = array[index1];
    	array[index1] = array[index2];
    	array[index2] = temp;
    	return array;
    }
    
    //8) Write a public static method named removeAtIndex, 
    //  that takes two arguments. The first argument is an Array of int, 
    //  and the second argument is an int index. This method create and return 
    //  a new array with all of the values in the argument array 
    //  except the value at the argument index.
    public static int[] removeAtIndex(int[] array, int index) {
    	int[] result = new int[array.length-1];
		for(int i = 0; i < index; i++) {
	        result[i] = array[i];
	    }
		for(int i = index; i < result.length; i++) {
 	       result[i] = array[i+1];
 	    }
		return result;
    }
    
		
    
    
    //9) Write a public static method named insertAtIndex, 
    //   that takes three arguments. The first argument is an Array of int, 
    //   the second argument is an int index, and the third argument is an int value. 
    //   This method create and return a new array with all of the values 
    //   in the argument array and including the third argument value 
    //   inserted at the index specified by the second argument value.
    public static int[] insertAtIndex(int[] array, int index, int value) {
    		int[] result = new int[array.length+1];
    		for(int i = 0; i < index; i++) {
    	        result[i] = array[i];
    	    result[index] = value;
    	    }
    	    for(int i = index + 1; i < result.length; i++) {
    	       result[i] = array[i - 1];
    	    }
    	    return result;
    }

    
    //10) Write a public static method named isSorted, 
    //    that takes an Array of int as an argument. 
    //    This method should return the boolean value true 
    //    if all the element values in the array are in ascending order; 
    //    otherwise the method should return the boolean value false.
	public static boolean isSorted(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        if (array[i] > array[i + 1])
	            return false;
	    }
	    return true;
	}
}