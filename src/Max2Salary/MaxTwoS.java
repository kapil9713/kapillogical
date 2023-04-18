package Max2Salary;

public class MaxTwoS {
	
	public static void main(String[] args) {
		
		int salary[]= {30,25,20,50};
		for(int i=0;i<salary.length;i++) {
			for(int j=i+1;j<salary.length;j++) {
				if(salary[i]>(salary[j])) {
				System.out.println("Maximum Salary="+salary[i]);
			}}
		}
		
	
	
	}

}
