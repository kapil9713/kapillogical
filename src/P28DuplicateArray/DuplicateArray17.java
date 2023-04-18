package P28DuplicateArray;

public class DuplicateArray17 {
	public static void main(String[] args) {
		
		int x[]= {11,23,78,11,45,78};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("DuplicateA="+x[i]);
				}
			}
		}
	}

}
