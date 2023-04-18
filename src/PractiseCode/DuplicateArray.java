package PractiseCode;

public class DuplicateArray {
	
public static void main(String[] args) {
		
		int x[]={45,22,56,76,45};
		
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==(x[j])){
					System.out.println("duplicate element is:"+x[i]);	
				}
			}
			
			
		}
			
	}

}
