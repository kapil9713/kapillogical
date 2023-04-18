package Max2Salary;

public class MaxTwoS4 {
	
	public static void main(String[] args) {
		
		int x[]= {500,50,200,100};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>(x[j])) {
					System.out.println("Maximum="+x[i]);	
				}
				
			}
			
		}
	}

}
