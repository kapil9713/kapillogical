package P28DuplicateArray;

public class DuplicateArray11 {
	
	public static void main(String[] args) {
		
		int x[]= {25,11,56,32,11,56};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==(x[j])) {
					System.out.println("Duplicate="+x[i]);
				}
			}
		}
	}

}
