package assignment1;

import java.util.Arrays;

public class SecondLargestNum {
	
	public static void main(String[] args) {
		int[] i = {2,3,8,13,9,7};
		Arrays.sort(i);
		
		System.out.println(i[i.length-2]+" is the second largest number");
	}
	
   }
