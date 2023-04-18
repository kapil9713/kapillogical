package P28;

public class Split4 {
	public static void main(String[] args) {
		
		String str="Ashwini_Rathore";
		String s[]=str.split("_");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
