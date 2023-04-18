package PractiseCode;

import java.util.Arrays;

public class ToFindOutLargestORSmallest {
	
	public static void main(String[] args) {
		
		int numbers[]= {-10,-88,45,87,9898};
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
	//	System.out.println("\n given array is:" +Arrays.toString(numbers));
		System.out.println("largest number"+largest);
		System.out.println("smallest number"+smallest);
	}

}
