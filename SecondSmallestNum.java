package assignment2;

import java.util.Arrays;

public class SecondSmallestNum {
	
	public static void main(String[] args) {
		int[] arr = {23,45,67,32,89,22};
		int a;
		int size;
		size = arr.length;
	
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if (arr[i]>arr[j]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
					
				}
				
		}
			
		}
		System.out.println("the second smallest number is "+arr[1]);
	}

}
