package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		 int num[] = {1, 4, 3, 2, 8, 6, 7};

	        // Step 1:Sort the array
	        Arrays.sort(num);

	        // Step 2:Loop through the array
	        for (int i = 0; i < num.length; i++) {
	            
	        //Step 3: Check if the iteration is not equal to array
	            if (num[i] != i + 1) {
	                System.out.println("The Missing Element is:"+(i + 1));
	                break;
	            }
	        }
	}
}
