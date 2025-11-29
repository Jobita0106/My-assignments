package week3.day1;

public class ReverseTheString {

	public static void main(String[] args) {
		
		//Step 1:Input String
        String companyName = "TestLeaf";

        //Step 2:Convert the string into character array
        char[] charArray = companyName.toCharArray();
        System.out.println("The Reversed Order Of The String: ");
        
        //Step 3:Print the characters into reverse order
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.println(charArray[i]);
        }
	}

}
