package com.inp;

//Parent-it contains both abstract and non abstract methods
public abstract class Abstrac {
	public void savings(int num) {
		System.out.println("savings per:" + num);
	}
	public void deposit() {
		System.out.println("deposit per:2%");
	}
	abstract void loan();
	public void account() {
		System.out.println("Current Account:3%");
	}
	abstract void fixed();

}
