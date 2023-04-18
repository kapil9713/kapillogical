package PractiseCode;

public class RemoveJunk {
	
	 public static void main(String[] args) {
		
		 String s="@#$%&* Kapil Rathore1";
		 String s1="@#$%&* Radha Soami";
		  s = s.replaceAll("[^a-zA-Z0-9]","");
		  s1=s1.replaceAll("[^a-zA-z0-9]", "");
		  System.out.println(s);
		  System.out.println(s1);
	}

}
