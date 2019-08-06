package com.test.DCAA;
//找重复     找出口   找边界

public class 递归 {
	public static void main(String[] args) {
		int f = f(5);
		System.out.println(f);
		tak(1,5);

	}
//找重复     找出口   找边界
	static int f(int i) {

		if (i == 1) {
			return 1;
		}
		return i * f(i - 1);

	}

	static void tak(int i, int j) {

		System.out.println(i);
		if (i == j) {
			return;
		}
		tak(i + 1, j);
	}

}
