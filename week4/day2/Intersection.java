package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
	public static void main(String[] args) {
		
		int arr1[] = {3, 2, 11, 4, 6, 7};
        int arr2[] = {1, 2, 8, 4, 9, 7};
        
        List<Integer> num1 = new ArrayList<Integer>();
        List<Integer> num2 = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
        	num1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
        	num2.add(arr2[i]);
        }
        System.out.println("Intersection Values are");
        for (int i = 0; i < num1.size(); i++) {
            if (num2.contains(num1.get(i))) {
                System.out.println(num1.get(i));
            }
        }
	}

}
