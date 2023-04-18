package P28;

public class Split18 {
	public static void main(String[] args) {
		
		String str="Selenium_Java";
		String[] s = str.split("_");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
