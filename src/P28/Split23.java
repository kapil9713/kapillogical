package P28;

public class Split23 {
	public static void main(String[] args) {
		
		String str="kapil_rathore";
		String[] s = str.split("_");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			
			
			
			
			
		}
		System.out.println("***********");
		
		String str1="automation_testing";
		String[] s1 = str1.split("_");
		String S=s1[0];
		String S1=s1[1];
		System.out.println(S);
		System.out.println(S1);
	}

}
