package MaxSalary;

public class MaxSalary8 {
	public static void main(String[] args) {
		
		int x[]= {10,9,56,34,87};
		int large=x[0];
		int small=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]>large) {
				large=x[i];
			}
			for(int j=i+1;j<x.length;j++) {
				if(x[i]<small) {
					small=x[i];
				}
			}
			
		}
		System.out.println("large="+large);
		System.out.println("small="+small);
		
		
	}

}
