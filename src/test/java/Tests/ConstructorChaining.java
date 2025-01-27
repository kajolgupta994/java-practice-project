package Tests;

class Vehicle {
	Vehicle() {
		System.out.println("Vehicle constructor");
	}

	Vehicle(String type) {
		this();
		System.out.println(type + " constructor");
	}
	Vehicle(String type, int a) {
		this(type);
		System.out.println(type+" constructor "+a);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		new Vehicle("Car", 1200);

	}

}
