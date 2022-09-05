package Exception;

public class ExceptionExam4 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			int k = divide(i, j);
			System.out.println(k);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}
	public static int divide(int i, int j) throws IllegalArgumentException{
		if(j == 0) {
			throw new IllegalArgumentException("cannot divide by zero.");
		}
		int k = i/j;
		return k;
	}
}
