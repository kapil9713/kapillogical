package P28ReverseS;

public class Reverse6 {
	
	public static void main(String[] args) {
		
		String str="lipak";
		int length = str.length();
		String s="";
		for(int i=length-1;i>=0;i--) {
			s=s+str.charAt(i);
		}
		System.out.println(s);
		System.out.println("****************");
		
		String str1="Kapil";
		System.out.println(new StringBuffer(String.valueOf(str1)).reverse());
	}

}
