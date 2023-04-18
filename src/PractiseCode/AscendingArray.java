package PractiseCode;

public class AscendingArray {
	public static void main(String[] args) {
		
		int []a= {98,45,54,43};
		for(int i=0;i<=a.length;++i) {
			for(int j=i-1;j<=a.length;++j)
				if(a[i]>a[j]);
			System.out.println(a[i]);
		}
		
	}

}
