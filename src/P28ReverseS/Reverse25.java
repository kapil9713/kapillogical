package P28ReverseS;

public class Reverse25 {
	public static void main(String[] args) {
		
		String str="kapil";
		String rev="";
		int length = str.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
