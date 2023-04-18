package P28;

public class Split14 {
	
	public static void main(String[] args) {
		
		String str="Automation_test";
		String[] s = str.split("_");
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println("********");
		
		String str1="Kapil Rathore";
		String[] s1 = str1.split(" ");
		String s2=s1[0];
		String s3=s1[1];
		System.out.println(""+s1[0]+"\n"+s1[1]+"");
		
		
		
	}
	
	

}
