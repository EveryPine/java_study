package javaStudy;

public class Car4 {
	String name;
	int number;
	
	public Car4(String name) {
		this.name = name;
	}
	
	public Car4(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public Car4() {
		 this("No name", 0);
	}
	
}
