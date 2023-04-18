package LinearSearchArray;

public class ArraySearch4 {
	
	public static void main(String[] args) {
		
		int x[]= {1,2,3,4,5,6,7,8};
		int search=10;
		boolean b=false;
		boolean b1=true;
		for(int i=0;i<x.length;i++) {
			if(search==x[i]) {
				System.out.println(b1+"");
				b=true;
				break;
			}
		}
		if(b==false) {
			System.out.println(b+"");
		}
		
		
	
	}

}
