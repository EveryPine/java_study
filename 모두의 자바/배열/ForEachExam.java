package first;

public class ForEachExam {

	public static void main(String[] args) {
		int[] arr = {10,20,30,5000};
		
		for(int i = 0; i < arr.length; i++) {
			int val = arr[i];
			System.out.println(val);
		}
		
		for(int val:arr) {
			System.out.println(val);
		}
	}

}
