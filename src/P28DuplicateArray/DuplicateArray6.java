package P28DuplicateArray;

public class DuplicateArray6 {
	
	public static void main(String[] args) {
		
		int x[]= {11,22,33,44,23,45,11,22};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("Duplicate Array="+x[i]);
				}
			}
			
		}

}}
