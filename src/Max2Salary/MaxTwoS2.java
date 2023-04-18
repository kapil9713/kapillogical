package Max2Salary;

public class MaxTwoS2 {
	
	public static void main(String[] args) {
		
		int x[]= {60,20,10,15};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>(x[j])) {
					System.out.println("MaximumS="+x[i]);	
				}
				
			}
			
		}
	}

}
