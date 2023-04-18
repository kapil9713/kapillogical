package P28DuplicateArray;

public class DuplicateArray7 {
	public static void main(String[] args) {
		
		int x[]= {11,34,55,11,65,34};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("Duplicate="+x[i]);
				}
			}
		}
	}

}
