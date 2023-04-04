package oop;

class ABCD {
	static void m1() {
		System.out.println("hi");
	}
}

public class Test extends ABCD {

	static void m1() {
		System.out.println("hello");
	}

	Test() {
		super();
	}

	void display() {
		m1();
//		super.m1();
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.display();
				
	}

}
