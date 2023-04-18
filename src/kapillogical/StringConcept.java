package kapillogical;

public class StringConcept {
	
	public static void main(String[] args) {
		
		String str="selenium";
		int length = str.length();
		String rev="";
		
		for(int i=length-1;i>=0;i--) {
			 rev=rev+ str.charAt(i);
		}
		 System.out.println(rev);
	}
	//2:- second way
	/*
	 * StringBuffer sf=new StringBuffer(str); System.out.println(sf.reverse());
	 */
		
	}


