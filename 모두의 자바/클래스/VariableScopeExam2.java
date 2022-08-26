package javaStudy;

public class VariableScopeExam2 {
	int globalScope = 10;
	static int staticVal = 7;

	public static void main(String[] args) {
		System.out.println(staticVal);
		
		VariableScopeExam2 v1 = new VariableScopeExam2();
		System.out.println(v1.globalScope);
		VariableScopeExam2 v2 = new VariableScopeExam2();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		
	}

}













