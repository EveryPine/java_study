package interface_OtherClass;

public class InnerExam3 {
	public void exec() {
		class Cal{
			int val = 0;
			public void plus() {
				val++;
			}
		}
        Cal Cal = new Cal();
        Cal.plus();
        System.out.println(Cal.val);
	}
	public static void main(String[] args) {
		InnerExam3 t = new InnerExam3();
		t.exec();
		
	}

}
