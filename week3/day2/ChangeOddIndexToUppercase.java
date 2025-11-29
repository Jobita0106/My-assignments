package week3.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String test = "changeme";

        // Step 1:Convert the string into char array
        char[] ch= test.toCharArray();

        // Step 2:Loop through each character (from end to start)
        for (int i = 0; i < ch.length; i++) {

            // Step 3:Check if the index is odd
            if (i % 2 != 0) {

                // Step 4:Convert odd index characters to uppercase
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }

        // Step 5:Printing the output
        System.out.println(String.valueOf(ch));  
	}

}
