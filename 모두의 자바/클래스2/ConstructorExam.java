package javaStudy;

public class ConstructorExam {
	public static void main(String[] args) {
		// Car c1 = new Car(); //error : The Constructor Car() is undefined
		Car2 c1 = new Car2("소방차");
		Car2 c2 = new Car2("구급차");
		
		System.out.println(c1.name);
		System.out.println(c2.name);

	}
}
