package p;

interface I {
	void m();
}

abstract class A implements I {
	public synchronized void m() {
	}
}