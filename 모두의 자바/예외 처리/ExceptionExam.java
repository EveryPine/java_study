package Exception;

public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			int k = i/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("cannot divide by zero " + e.toString());
		}finally {
			System.out.println("finally is progressed.");
		}
		System.out.println("main end!");
	}

}
