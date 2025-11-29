package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		//Step 1:Declare the arrays
		int a[] = {3, 2, 11, 4, 6, 7};
		int b[] = {1, 2, 8, 4, 9, 7};

        //Step 2:Loop iterator the first array length
        for (int i = 0; i < a.length; i++) {

        //Step 3:Nested for another array
        for (int j = 0; j < b.length; j++) {

        //Step 4:Compare the values
           if (a[i] == b[j]) {

        //Step 5: Print the matching item
            System.out.println("The Matching Element:"+a[i]);
                }
            }
        }
	}

}
