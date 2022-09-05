package Exception;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			int k = i/j; // j = 0 이므로 예외 발생
			System.out.println(k);
		}catch(NullPointerException e) {
			System.out.println("Null cannot be handled " + e.toString());
		}finally {
			System.out.println("finally is progressed."); //예외 발생 여부와 상관없이 무조건 실행
		}
		System.out.println("main end!");
	}

}
