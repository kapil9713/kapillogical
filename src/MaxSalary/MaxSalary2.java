package MaxSalary;

public class MaxSalary2 {
	
	public static void main(String[] args) {
		
		int number[]= {1000,25000,3000,45000,200};
		int largest=number[0];
		int smallest=number[0];
		for(int i=0;i<number.length;i++) {
			if(number[i]>largest) {
				largest=number[i];
			}
			for(int j=1;j<number.length;j++) {
				if(number[i]<smallest) {
					smallest=number[i];
				}
			}
			
		}
		System.out.println("largest number="+largest);
		System.out.println("smallest number="+smallest);
	}

}
