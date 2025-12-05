package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int arr[] = {3, 2, 11, 4, 6, 7};
		List<Integer> large = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
		    int num = arr[i];
		    large.add(num);
		}
		Collections.sort(large);
        int secondLarge = large.get(large.size() - 2);
        System.out.println("The Second Largest Number is:" + secondLarge);

	}

}
