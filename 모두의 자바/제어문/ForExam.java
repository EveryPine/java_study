package first;

public class ForExam {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 100; i++) {  
			/* for(초기문; 조건문; 증감문){명령;} 초기문에서 처음 한번만 초깃값 부여 (즉, 한번만 실행됨) 
			 * 그리고 조건문이 만족할때마다 {}안 명령을 실행하고 증감문을 통해 값이 변하면서 조건문이 false가 되면 for문이 끝남
											 */
			total += i;
		}
		System.out.println(total);
	}
}
