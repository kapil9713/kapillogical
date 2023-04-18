package P28DuplicateArray;

public class DuplicateArray19 {
	public static void main(String[] args) {
		
		int x[]= {11,89,45,32,11,89};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("DuplicateA="+x[i]);
				}
			}
		}
	}

}
