package interface_OtherClass;

public class InnerExam2 {
	static class Cal{
		int val = 0;
		public void plus() {
			val++;
		}
	}
	public static void main(String[] args) {
		InnerExam2.Cal Cal = new InnerExam2.Cal();
		Cal.plus();
		System.out.println(Cal.val);
	}

}
