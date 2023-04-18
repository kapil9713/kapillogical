package Max2Salary;

public class MaxTwoS7 {
	public static void main(String[] args) {
		
		int x[]= {23,65,34,89};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("Max2S="+x[i]);
				}
			}
		}
	}

}
