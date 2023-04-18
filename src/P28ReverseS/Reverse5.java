package P28ReverseS;

public class Reverse5 {
	
	public static void main(String[] args) {
		
		String str="Avni";
		int length=str.length();
		String c="";
		for(int i=length-1;i>=0;i--) {
			c=c+str.charAt(i);
		}
		System.out.println(c);
	}

}
