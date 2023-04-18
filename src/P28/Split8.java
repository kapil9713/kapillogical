package P28;

public class Split8 {
	
	public static void main(String[] args) {
		
		String str="Kapil_Rathore";
		String []s=str.split("_");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
