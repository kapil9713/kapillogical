package PractiseCode;

public class SwapString {
	
	public static void main(String[] args) {
		
		String a="hello";  
		String b="world";
		//1. append a and b
		a=a+b;
		
		//2. store initial string a in string b
		b=a.substring(0,a.length()-b.length());
		
		//3. store initial string b in string a:
		a=a.substring(b.length());
		System.out.println("a="+a);  
		System.out.println("b="+b);
	}

}
