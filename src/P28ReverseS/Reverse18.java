package P28ReverseS;

public class Reverse18 {

	public static void main(String[] args) {
		
		String str="this is a market abhay gupta";
		
		int length = str.length();
		String s="";
		for(int i=length-1;i>=0;i--) {
			s=s+str.charAt(i);
		}
		System.out.println(s);
		
		
		

	}

}
