package AscendingArray;

public class Array14 {
	public static void main(String[] args) {
		
		int x[]= {1,9,2,8,3,7,4,6};
		int asc=0;
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>x[j]) {
					asc=x[i];
					x[i]=x[j];
					x[j]=asc;
				}
			}
			System.out.println(x[i]);
		}
	}

}
