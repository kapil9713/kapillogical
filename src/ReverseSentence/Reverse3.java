package ReverseSentence;

public class Reverse3 {
	public static void main(String[] args) {

		String str = "kapil software jyoti";
		String[] s = str.split(" ");
		String sentence="";
		for(int i=s.length-1;i>=0;i--) {
			sentence+=s[i]+" ";
		}
		System.out.println(sentence);
	}

}
