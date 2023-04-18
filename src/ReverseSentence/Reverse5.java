package ReverseSentence;

public class Reverse5 {
	public static void main(String[] args) {
		
		String str="kapil_rathore";
		String[] s = str.split("_");
		String sentence="";
		for(int i=s.length-1;i>=0;i--) {
			sentence+=s[i]+" ";
		}
		System.out.println(sentence);
		
	}

}
