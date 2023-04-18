package Max2Salary;

public class MaxTwoS3 {
	public static void main(String[] args) {
		
		int y[]= {11, 22, 56, 76, 45};
		for(int i=0;i<y.length;i++) {
			for(int j=i+1;j<y.length;j++) {
				if(y[i]>(y[j])) {
					System.out.println("MaximumTwoS="+y[i]);
				}
				
			}
		}
		
		
	
	
	}

}
