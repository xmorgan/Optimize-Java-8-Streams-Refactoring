package p;

import javax.annotation.Generated;

interface I {
	void m(@Generated("goodbye") int n, @Generated("hello") int q);
}

abstract class A implements I {
	public void m(@Generated("hello") int n, @Generated("goodbye") int q) {
	}
}