package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	
	public static void main(String[] args) {
		
		Integer arr[] = {1, 2, 3, 4, 10, 6, 8};

		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, arr);
	    
	    Collections.sort(list);
	    System.out.println("The Sorted Lists are:" + list);
        System.out.println("The Missing numbers are:");
        
        for (int i = 0; i < list.size() - 1; i++) {
            int a = list.get(i);
            int b = list.get(i + 1);

            if (b != a + 1) {
            for (int m = a + 1; m < b; m++) {
            System.out.println(m);
            }
            }
        }

	}
	
}
