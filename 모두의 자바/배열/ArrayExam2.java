package first;

public class ArrayExam2 {

	public static void main(String[] args) {
		int[][] array1 = new int[3][4];
		int[][] array2 = new int[3][];
		array2[0] = new int[1];
		array2[1] = new int[2];
		array2[2] = new int[3];
		int[][] array3 = {{1},{1,2},{1,2,3,4}}; 
		// int[][] array3 = new int{{1},{1,2},{1,2,3,4}}; 와 같다.
	}

}
