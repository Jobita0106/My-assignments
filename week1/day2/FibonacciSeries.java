package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 13;
		
        int a = 0, b = 1, c;

        System.out.println(a);

        System.out.println(b);
        
        for (int i = 2; i <= 7; i++) 
        	
        {  
        	
            c = a + b;

            a = b;
            
            b = c;
            
            if (c < range) 
            	
            {
            	
                System.out.println(c);
                
            } 

            else {
            	
                System.out.println(c);
                
            }
            
        }
        
		 	}
	
}
