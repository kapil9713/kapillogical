package P28DuplicateArray;

public class DuplicateArray3 {
	
	public static void main(String[] args) {
		
		int x[]= {22,25,22,89,89};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("Duplicate Array="+x[i]);
				}
			}
		}
	}

}
