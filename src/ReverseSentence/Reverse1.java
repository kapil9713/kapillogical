package ReverseSentence;

public class Reverse1 {

	public static void main(String[] args) {
		
		String str="abhay gupta bamore";
		String[] s = str.split(" ");
		String sentence="";
		for(int i=s.length-1;i>=0;i--) {
			sentence+=s[i]+" ";
		}
		System.out.println(sentence);
		
		
		
		

	}

}
