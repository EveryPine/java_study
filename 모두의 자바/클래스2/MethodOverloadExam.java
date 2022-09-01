package javaStudy;

public class MethodOverloadExam {
	public static void main(String args[]) {
		MyClass2 m = new MyClass2();
		System.out.println(m.plus(1, 2));
		System.out.println(m.plus(1, 2, 3));
		System.out.println(m.plus("apple", "banana"));
		
	}
}
