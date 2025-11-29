package week3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		 String rev = "I am a software tester";
	        String[] letters = rev.split(" ");

	        for (int i = 0; i < letters.length; i++) {
 
	        	 //Step 1:odd position words
	            if (i % 2 != 0) {    

	                char[] texts = letters[i].toCharArray();
	                String reversed = "";

	                //Step 2:reverse using loop
	                for (int j = texts.length - 1; j >= 0; j--) {
	                    reversed = reversed + texts[j];
	                }

	                System.out.print(reversed + " ");

	            }  else {
	                System.out.print(letters[i] + " ");
	            }
	        }

	}

}
