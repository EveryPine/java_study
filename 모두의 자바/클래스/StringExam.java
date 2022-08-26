package javaStudy;

public class StringExam {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		
		String str3 = "hello";
		String str4 = new String("hello");
		if(str1 == str2) {
			System.out.println("str1 and str2 are same references.");

		}
		if(str1 == str3) {
			System.out.println("str1 and str3 are same references.");

		}
		if(str2 == str4) {
			System.out.println("str2 and str4 are same references.");

		}
		
	}	
}
