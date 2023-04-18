package MaxSalary;

public class MaxSalary3 {
	
	public static void main(String[] args) {
		
		int []number= {1000,2000,7500,100,96500,20};
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
		System.out.println("largest="+largest);
		System.out.println("smallest="+smallest);
	}

}
