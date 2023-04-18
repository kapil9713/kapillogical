package P28;

public class Split19 {

	public static void main(String[] args) {
		
		String str="Automation_Test";
		String[] s = str.split("_");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
