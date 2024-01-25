// Java Program to Find the Largest
// Element in Array using Java Stream
import java.util.Arrays; 

// Driver Class
public class GFG {
	// main function
	public static void main(String[] args){ 
		int arr[] = {10, 324, 45, 90, 9808}; 
		
		// Java Stream and max to find the max element
		// in array
		int max = Arrays.stream(arr).max().getAsInt(); 
	
		// Printing the result
		System.out.println("Largest in given array is " +max); 
	} 

} 
