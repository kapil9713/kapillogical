package SwapString;

public class Swap10 {
	public static void main(String[] args) {
		
		String a="kapil";
		String b="rathore";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("a="+a+"\nb="+b+"");
	}

}
