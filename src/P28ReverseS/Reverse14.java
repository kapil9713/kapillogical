package P28ReverseS;

public class Reverse14 {
	public static void main(String[] args) {
		
		String str="avni";
		int length = str.length();
		String s="";
		for(int i=length-1;i>=0;i--) {
			s =s+ str.charAt(i);
		}
		System.out.println(s);
	}

}
