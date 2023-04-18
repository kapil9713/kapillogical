package PractiseCode;

public class Min2Salary {

	public static void main(String[] args) {

		int x[]={11,22,76,45};

		for(int i=0;i<x.length-1;i++) {
			for (int j=i+1;j<x.length-1;j++) {
				if(x[i]<(x[j])){
					System.out.println("Minimum 2 salary is::="+x[i]);
				}
			}

		}
	}

}
