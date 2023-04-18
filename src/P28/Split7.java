package P28;

public class Split7 {
	
	public static void main(String[] args) {
		
		String str="Automation_Test_Engineer";
		String s[]=str.split("_");
		for(int i=0;i<=s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
