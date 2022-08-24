package first;

public class SwitchExam {
	public static void main(String[] args) {
		String str = "A";
		
		switch(str) { // ()안 값과 case 뒤의 값이 일치하는 case 구문부터 {}안 모든 명령 실행, 단 break를 만나면 종료된다.
		case "A":
			System.out.println("A");
		break;
		case "B":
			System.out.println("B");
		break;
		case "C":
			System.out.println("C");
		break;
		default: // 생략 가능
			System.out.println("the other words");
		}
	}
}
