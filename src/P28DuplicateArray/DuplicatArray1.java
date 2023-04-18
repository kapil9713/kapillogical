package P28DuplicateArray;

public class DuplicatArray1 {

	public static void main(String[] args) {
		
		int[] x = { 11, 12, 13, 14, 15, 11, 22, 13, 15 };
		for(int i = 0; i < x.length; i++) {
			for(int j =i+1; j < x.length; j++) {
				if(x[i] == x[j]) {
					System.out.println("Duplicate Array=" + x[i]);

				}

			}
		}
	}
}
