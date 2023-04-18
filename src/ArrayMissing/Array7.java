package ArrayMissing;

public class Array7 {
	
	public static void main(String[] args) {
		
		int x[]= {1,2,4,5,6};
		int sum=0;
		for(int i=0;i<x.length;i++) {
			sum=sum+x[i];
		}
		int sum1=0;
		for(int j=1;j<6;j++) {
			sum1=sum1+j;
		}
		System.out.println("ArrayMissing="+(sum-sum1));
	}

}
