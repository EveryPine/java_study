package first;
import java.util.Scanner;
public class DoWhileExam {
	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in);
		do { /*   do{}while(조건문) -> while 괄호 안 명령들은 while의 조건이 false이면 한번도 실행이 안되는데 반해. 
					do while의 {}안 명령들은 참 거짓 유무에 상관없이 적어도 한번은 실행된다. */
			value =scan.nextInt();
			System.out.println("입력받은 값:" + value);
		}while(value != 10);
		System.out.println("반복문 종료!!");
	}
}
