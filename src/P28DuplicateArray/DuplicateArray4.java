package P28DuplicateArray;

public class DuplicateArray4 {
	public static void main(String[] args) {
		
		int x[]= {12,11,13,15,22,12,55,44,55};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("Duplicate Array="+x[i]);
				}
			}
		}
	}
	
	

}
