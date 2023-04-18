package Max2Salary;

public class MaxTwoS5 {
	public static void main(String[] args) {
		
		int x[]= {25000,250,45000,980};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>(x[j])) {
					System.out.println("Maximun="+x[i]);
				}
				
				
			}
		}
	}

}
