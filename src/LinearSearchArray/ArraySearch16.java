package LinearSearchArray;

public class ArraySearch16 {
	public static void main(String[] args) {
		
		int x[]= {1,2,3,4,5,6,7,8,9};
		int search=0;
		boolean b=false;
		boolean b1=true;
		for(int i=0;i<x.length;i++) {
			if(search==x[i]) {
				System.out.println(b1);
				b=true;
				break;
				
			}
		}
		if(b==false) {
			System.out.println(b);
		}
	}

}
