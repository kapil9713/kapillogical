package LinearSearchArray;

public class ArraySearch8 {
	public static void main(String[] args) {
		
		int x[]= {1,3,5,7,9,4,6};
		int search=5;
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
