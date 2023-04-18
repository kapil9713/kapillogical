package P28ReverseS;

public class Reverse23 {
	public static void main(String[] args) {
		
		String str="java selenium";
		String[] s = str.split(" ");
		String sentence="";
		for(int i=s.length-1;i>=0;i--) {
			sentence+=s[i]+" ";
		}
		System.out.println(sentence);
	}

}
