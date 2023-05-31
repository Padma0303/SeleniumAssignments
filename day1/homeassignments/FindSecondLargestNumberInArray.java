package week2.day1.homeassignments;

import java.util.Arrays;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] data = {3,2,11,4,6,7};
		 
		 Arrays.sort(data);
		// System.out.println(data[]);
		 
		 int len = data.length;
		 System.out.println(len);
		 
		 for(int i =0;i<len;i++) {
			 System.out.println(data[i]);
		 }
		 System.out.println("The second largest is"+data[len-2]);

	}

}
