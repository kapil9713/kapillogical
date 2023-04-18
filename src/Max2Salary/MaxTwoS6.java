package Max2Salary;

public class MaxTwoS6 {
	public static void main(String[] args) {
		
		int x[]= {1100,200,600,700,9000};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>(x[j])) {
					System.out.println("MaximumS="+x[i]);
				}
			}
		}
		
	}

}
