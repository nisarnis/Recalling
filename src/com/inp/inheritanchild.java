package com.inp;

//inheritance (child)
public class inheritanchild extends Inheritance {
	private void district() {
		System.out.println("thiruchurapalli");
	}

	public static void main(String[] args) {
		inheritanchild chl = new inheritanchild();
		chl.id();
		chl.name();
		chl.district();
//Without Extends-We can create object creation
		inheritchild2 in = new inheritchild2();
		in.address();
		in.idno();
	}
}
