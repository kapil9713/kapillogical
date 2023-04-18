package P28DuplicateArray;

public class DuplicateArray14 {
	public static void main(String[] args) {
		
		int x[]= {56,12,9,12,23,56,9}; //56,9,12
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("DuplicateA="+x[i]);
				}
			}
		}
	}

}
