package first;

public class ArrayWithFor1 {

	public static void main(String[] args) {
		int[] sum_array = new int[100];
		for(int i = 0; i < 100; i++) {
			sum_array[i] = i + 1;
		}
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += sum_array[i];
		}
	System.out.println(sum);
	}

}
