package RemoveJunk;

public class Junk1 {
	public static void main(String[] args) {
		
		String s="@#$%12^&*Kapil006Rathore784567";
		s=s.replaceAll("[^a-zA-Z]","");
		System.out.println(s);
	}

}
