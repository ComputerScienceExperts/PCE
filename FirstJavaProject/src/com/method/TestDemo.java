package com.method;

class Emp {
	public int addSum(int x, int y) {
		int sum = x + y;
		return sum;
	}
}

class Eng extends Emp {
	public int addSub(int x, int y) {
		int sum = x - y;
		return sum;
	}

}

public class TestDemo {

	public static void main(String[] args) {
		Eng eng = new Eng();
		System.out.println("Salary : " + eng.addSum(12, 10) + " Benifits : " + eng.addSub(12, 10));

	}

}
