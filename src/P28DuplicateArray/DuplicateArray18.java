package P28DuplicateArray;

public class DuplicateArray18 {
	public static void main(String[] args) {
		
		int x[]= {1,2,3,4,1,2};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("DuplicateA="+ x[i]);
				}
			}
		}
	}

}
