package MaxSalary;

public class MaxSalary4 {
	
	public static void main(String[] args) {
		
		int x[]= {1000,2000,3000,4000};
		
		int largest=x[0];
		int smallest=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]>largest) {
				largest=x[i];
			}
			
			for(int j=1;j<x.length;j++) {
				if(x[i]<smallest) {
					smallest=x[i];
				}
			}
		}
		System.out.println("Largest="+largest);
		System.out.println("smallest="+smallest);
	}

}
