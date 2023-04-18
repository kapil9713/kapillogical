package logicalP;

public class Split {
	
	public static void main(String[] args) {
		
		String str="Hello_World_Selenium_Java";
		String[] s = str.split("_");
		String s1=s[0];
		String s2=s[1];
		String s3=s[2];
		String s4=s[3];
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		
		System.out.println("*****************************");
		
		String[] S = str.split("_");
		for(int i=0;i<S.length;i++) {
			System.out.println(s[i]);
		}
	}

}
