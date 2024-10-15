package com;

public class TestCons {
	int x;

	public TestCons(int x) {
		this.x = x;
	}

	public TestCons() {
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		TestCons testCons = new TestCons(6);
		System.out.println(testCons.x);
	}

}
