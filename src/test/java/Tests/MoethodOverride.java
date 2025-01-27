package Tests;

public class MoethodOverride {

	
	
	public static void main(String[] args) {
		BAAA b = new BAAA();
		b.show();

	}

}

class AAAA {
	public void show() {
		System.out.println("Test1");
	}
}
class BAAA extends AAAA{
	@Override
	public void show() {
		System.out.println("Test2");
	}
}
