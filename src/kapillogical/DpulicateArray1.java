package kapillogical;

public class DpulicateArray1 {
	
	public static void main(String[] args) {
		
		int[]x= {45,55,65,85,98,45,55};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("Duplicate Array is::="+ x[i]);
				}
			}
			
		}
		
	}

}
