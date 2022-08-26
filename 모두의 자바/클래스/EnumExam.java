package javaStudy;

public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;

		gender1 = "boy";
		
		Gender gender2; 
		//gender2에는 Gender.MALE, Gender.FEMALE만 들어간다.
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;

	}

}
enum Gender{
	MALE, FEMALE;
}
