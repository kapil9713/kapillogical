package MaxSalary;

public class MaxSalary7 {
	
	public static void main(String[] args) {
		
		int x[]= {25,87,12,85,52};
		int largest=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]>largest)
				largest=x[i];
			
		}
		System.out.println("LargestSalary="+largest);
	}
	

}
