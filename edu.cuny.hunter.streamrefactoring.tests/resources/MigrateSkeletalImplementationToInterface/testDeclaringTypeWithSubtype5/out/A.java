package p;

interface I {
	default void m() {
	}
}

interface J extends I {
	void m();
}

public abstract class A implements I {
}

abstract class C extends A implements J {
}

class B extends C {

	@Override
	public void m() {
		super.m();
	}
}