package P28DuplicateArray;

public class DuplicateArray9 {
	
	public static void main(String[] args) {
		
		int x[]= {12,32,33,42,12,33};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("Duplicate="+x[i]);
				}
			}
		}
	}

}
