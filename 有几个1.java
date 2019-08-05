package com.test.DCAA;

/**
 * 判断一个数字一共有几个1
 *
 */
public class 有几个1 {

	public static void main(String[] args) {
		int a = 9;int count=0;
		System.out.println(Integer.toString(a, 2));
		for (int i = 0; i < 32; i++) {
			if((a&(1<<i))==1<<i){
				count++;
				System.out.println(i);
			}
		}
		System.out.println(count);
	}

}
