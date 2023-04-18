package ReverseSentence;

public class Reverse13 {
	public static void main(String[] args) {
		
		String str="java selenium";
		String sentence="";
		String[] s = str.split(" ");
		for(int i=s.length-1;i>=0;i--) {
			sentence+=s[i]+" ";
		}
		System.out.println(sentence);
	}

}
