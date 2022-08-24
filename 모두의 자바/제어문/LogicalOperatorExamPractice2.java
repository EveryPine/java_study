package first;

public class LogicalOperatorExamPractice2{
	public boolean isAgeTwenties(int age){
		boolean isTwenties = false;
		if(age >= 20 && age < 30) {
			isTwenties = true;
		}else{
			isTwenties = false;
		}
    
    		return isTwenties; 
	}

	public static void main(String[] args){
		LogicalOperatorExamPractice2 exam = new LogicalOperatorExamPractice2();
		System.out.println(exam.isAgeTwenties(19));
		System.out.println(exam.isAgeTwenties(25));
		System.out.println(exam.isAgeTwenties(30));
	}
}