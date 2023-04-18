package MaxSalary;

public class MaximumSalary {

	public static void main(String[] args) {

		int number[] = { 100, 200, 400, 1000 };
		int largest = number[0];
		int smallest = number[0];

		for (int i = 0; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];

			}
			for (int j = 1; j < number.length; j++) {
				if (number[i] < smallest) {
					smallest = number[i];

				}
			}

		}
		System.out.println("largest number=" + largest);
		System.out.println("smallest number=" + smallest);
	}

}
