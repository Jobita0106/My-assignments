package week1.day2;

public class IsNotPrimeNumber {

	public static void main(String[] args) {
		
        int n = 4; 
		
		for (int i = 2; i < n; i++) 
		
		{  
		    if (n <= 1) 
		    
		    {
		        
		    	System.out.println(n + " is not a Prime Number");
		    	
		        break;  
		        
		    } 
		    
		    else if (n % i == 0) 
		    
		    {
		        
		    	System.out.println(n + " is not a Prime Number");
		        		        
		        break;   
		        
		    }
		    
		    else if (i == n-1) 
		    
		    {
		        
		        System.out.println(n + " is a Prime Number");
		    }
		}
	}

}
