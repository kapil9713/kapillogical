package ReverseSentence;

public class Reverse14 {
	public static void main(String[] args) {
		String sentence="";
		
		String str="java selenium";
		String[] s = str.split(" ");
		for(int i=s.length-1;i>=0;i--) {
			sentence+=s[i]+" ";
		}
		System.out.println(sentence);
	}

}
