package com.method;

public class Test3 {

	public int addSum(int x, int y) {
		int sum = x + y;
		return sum;
	}

	public int addSub(int x, int y) {
		int sum = x - y;
		return sum;
	}

	public static void main(String[] args) {
		Test3 test2 = new Test3();
		int result = test2.addSum(5, 7);
		int result1 = test2.addSub(7, 6);
		System.out.println(result);
		System.out.println(result1);

	}

}
