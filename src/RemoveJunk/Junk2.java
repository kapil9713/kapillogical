package RemoveJunk;

public class Junk2 {
	
	public static void main(String[] args) {
		
		String s="!@#$%&*Kapil23Rathore1245";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
