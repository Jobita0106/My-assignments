package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		//Step 1:Define two input strings
        String word1 = "stops";
        String word2 = "potss";

        //Step 2:Check if the lengths are equal
        if (word1.length() != word2.length()) {
            System.out.println("The lengths are mismatch,so the strings are not an Anagram.");
            return;   
        }

        //Step 3:Convert both the strings into character arrays
        char[] array1 = word1.toLowerCase().toCharArray();
        char[] array2 = word2.toLowerCase().toCharArray();

        //Step 4:Sort both the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        //Step 5:Compare both the sorted arrays
        if (Arrays.equals(array1, array2)) {
            System.out.println("The strings are Anagram.");
        } else {
            System.out.println("The strings are not an Anagram.");
        }

	}

}
