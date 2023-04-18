package LinearSearchArray;

public class SearchNumberInArray {
	
	public static void main(String[] args) {
		
		int x[]= {1,2,3,4,5,6,7};
		int search=7;
		boolean b=false;
		for(int i=0;i<x.length;i++) {
			if(search==x[i]) {
				System.out.println("true="+x[i]);
				b=true;
				break;
			}
		}
		if(b==false) {
			System.out.println("false="+b);
		}
		
	}

}
