package kapillogical;

public class RemoveJunk {
	
	public static void main(String[] args) {
		
		String s="!@#$%&*235464 Kapil Rathore";
		String s1="*&%$#@###@####1 java Selenium";
		s=s.replaceAll("[^a-zA-Z]", "");
		 s1 = s1.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
		System.out.println(s1);
	}

}
