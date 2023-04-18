package MaxSalary;

public class MaxSalary5 {
	public static void main(String[] args) {
		
		int number[]= {23,34,56,78,99};
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
		System.out.println("Largest="+largest);
		System.out.println("smallest="+smallest);
	}

}
