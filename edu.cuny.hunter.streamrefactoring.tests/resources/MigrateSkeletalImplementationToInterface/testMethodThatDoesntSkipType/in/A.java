package p;

interface I {
	void m();
}

abstract class A implements I {
	public void m() {
		System.out.println("Hello");
	}
}

class Main {
	public static void main(String[] args) {
		new A() {}.m(); //should print Hello.
	}
}