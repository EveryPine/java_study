package interface_OtherClass;

public class InterfaceExam {

	public static void main(String[] args) {
		TV tv = new LedTV();
		tv.turnOn();
		tv.changeVolume(29);
		tv.changeChannel(23);
		tv.turnOff();
	}

}
