package interface_OtherClass;

public class CalTest {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		cal.plus(1,3);
		cal.multiple(2, 3);
		//int i = cal.exec(5, 6);
		//System.out.println(i);
		
		Calculator.exec2(3, 3);
		
	}

}
