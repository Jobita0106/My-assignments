package week3.day2;

public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
		
		// Step 1: Initialize a variable 'count' to keep track of the number of duplicate words found
        int count = 0;

        // Step 2: Split the text into an array of words using space as the delimiter
        String text = "We learn Java basics as part of java sessions in java week1";
        String[] letters = text.split(" ");

        // Step 3: Create two nested for loops to compare each word with every other word in the String array
        for (int i = 0; i < letters.length; i++) {

            for (int j = i + 1; j < letters.length; j++) {

        // Step 4:If a duplicate word is found, replace it with an empty string and increment count
                if (letters[i].equalsIgnoreCase(letters[j])) {
                	letters[j] = "";   
                    count++;         
                }
            }
        }

        //Step 5:if count > 1,then print the modified array
        if (count > 1) {
            for (int i = 0; i < letters.length; i++) {
                System.out.print(letters[i] + " ");
            }
        }
	}

}
