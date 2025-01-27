package Tests;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface A {
	void show();
}

interface B extends A {
	void show();
}

class C implements A, B {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
abstract class Animal {
    abstract void makeSound();  // Abstract method (no body)
    
    void sleep() {  // Concrete method (with body)
        System.out.println("Sleeping...");
    }
}

class D extends Animal{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		
	}
	
}
