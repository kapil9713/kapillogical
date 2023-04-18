package P28;

public class Split3 {
	
	public static void main(String[] args) {
		
		String str="welcome_back";
		String[] s=str.split("_");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
