
	 import java.util.*;
	 
	 public class Javaswap {
	  
	     // Function to swap two numbers
	     // Using temporary variable
	     static void swapValuesUsingSecondVariable(int m, int n)
	     {
	         // Swapping the values
	         int temp = m;
	         m = n;
	         n = temp;
	         System.out.println("Value of m is " + m
	                            + " and Value of n is " + n);
	     }
	  
	     // Main driver code
	     public static void main(String[] args)
	     {
	         // Random integer values
	         int m = 4, n = 5;
	  
	         // Calling above function to
	         // reverse the numbers
	         swapValuesUsingSecondVariable(m, n);
	     }
	 }

