package kapillogical;

public class ArrayMissingNumber {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,5};//4
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=1;j<5;j++) {
			sum1=sum+j;
		}
		System.out.println(sum1);
		
		System.out.println("missing no is:="+(sum1-sum));
	}
	
	

}
