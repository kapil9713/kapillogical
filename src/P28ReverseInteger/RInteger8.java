package P28ReverseInteger;

public class RInteger8 {
	public static void main(String[] args) {
		
		int x=12345;
		int rev=0;
		while(x!=0) {
			rev=rev*10+x%10;
			x=x/10;
		}
		System.out.println(rev);
		System.out.println("*****************");
		
		int x1=54321;
		System.out.println(new StringBuffer(String.valueOf(x1)).reverse());
	}
	

}
