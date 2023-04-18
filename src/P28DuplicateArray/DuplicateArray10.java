package P28DuplicateArray;

public class DuplicateArray10 {
	public static void main(String[] args) {
		
		int x[]= {11,85,11,74,33,85};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("DuplicateArray="+x[i]);	
				}
				
			}
		}
	}

}
