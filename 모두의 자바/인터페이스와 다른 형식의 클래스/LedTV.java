package interface_OtherClass;

public class LedTV implements TV {

	public void turnOn() {
		System.out.println("turn on");

	}

	public void turnOff() {
		System.out.println("turn off");


	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("changed volume");


	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("changed channel");

	}

}
