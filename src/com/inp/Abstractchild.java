package com.inp;

//child
public class Abstractchild extends Abstrac {
	@Override
	void loan() {
		System.out.println("loan:2%");

	}

	@Override
	void fixed() {
		System.out.println("Fixed:3%");

	}
	@Override
	void currentAccount() {
		System.out.println("current:6%");
		
	}

	public static void main(String[] args) {
		Abstractchild c = new Abstractchild();
		c.deposit();
		c.fixed();
		c.savings(90);

	}

}
