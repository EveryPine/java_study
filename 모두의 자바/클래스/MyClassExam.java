package javaStudy;

public class MyClassExam {

	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.method1();
		myclass.method2(10);
		int val = myclass.method3();
		System.out.println("m3 returned: " + val);
		myclass.method4(1, 3);
		int val2 = myclass.method5(40);
		System.out.println("m5 returned: " + val2);
	}

}
