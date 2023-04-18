package P28DuplicateArray;

public class DuplicateArray2 {
	
	public static void main(String[] args) {
		
		int [] x= {58,54,89,447,8745,9898,447};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("Duplicate Array="+x[i]);
				}
			}
		}
		
	}

}
