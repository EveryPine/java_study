package interface_OtherClass;

public class innerExam1 {
	class Cal{
		int val = 0;
		public void plus() {
			val++;
		}
	}
	public static void main(String[] args) {
		innerExam1 t = new innerExam1();
		innerExam1.Cal Cal = t.new Cal();
		Cal.plus();
		System.out.println(Cal.val);
	}

}
