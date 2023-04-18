package kapillogical;

public class DuplicateElementArray {
	
	public static void main(String[] args) {
		
		String names[]={"Java, Phy,C,Java,HTML,JavaScript,Ruby,Phy"};
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])){
					System.out.println("duplicate element is:"+names[i]);
				}
			}
			
		}
	}

}
