package PractiseCode;

public class Max2Salary {

	public static void main(String[] args) {

		int x[] = { 11, 22, 56, 76, 45 };

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > (x[j])) {
					System.out.println("maximum 2 salary is::" + x[i]);
				}
			}

		}

	}
}
