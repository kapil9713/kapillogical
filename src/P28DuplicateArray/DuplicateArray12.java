package P28DuplicateArray;

public class DuplicateArray12 {

	public static void main(String[] args) {
		
		int x[]= {11,43,5,22,11,43};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==(x[j])) {
					System.out.println("DuplicateArray="+x[i]);
				}
			}
		}
		
		

	}

}
