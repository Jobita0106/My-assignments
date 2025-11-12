package week1.day2;

public class Palindrome12345 {

	public static void main(String[] args) {
		
		 int input = 12345;
		 
	     int output = 0;   
	     
	     int rem;               
	     
	        for (int i = input; i > 0; i = i / 10) 
	        	
	        {
	        	
	            rem = i % 10;    
	            
	            output = output * 10;   
	            
	            output = output + rem;  
	            
	        }
	        
	        if (input == output)
	        	
	        {
	        	
	            System.out.println("It is a Palindrome");
	            
	        } 
	        
	        else {
	        	
	            System.out.println("It is not a Palindrome");
	            
	        }
	}

}
