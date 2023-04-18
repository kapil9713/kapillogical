package P28ReverseS;

public class Reverse20 {
	public static void main(String[] args) {
		
		String str="selenium java";
		int length = str.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
