package LinearSearchArray;

public class ArraySearch9 {
	public static void main(String[] args) {
		
		int x[]= {9,6,8,5,2,1};
		int search=9;
		boolean b=false;
		boolean b1=true;
		for(int i=0;i<x.length;i++) {
			if(search==x[i]) {
				System.out.println(b1);
				//b=true;
				break;
			}
		}
		if(b==false) {
			System.out.println(b);
		}
	}

}
