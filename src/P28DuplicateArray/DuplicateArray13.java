package P28DuplicateArray;

public class DuplicateArray13 {
	public static void main(String[] args) {
		
		int x[]= {11,22,33,9,11,33};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println(x[i]);
				}
			}
		}
	}

}
