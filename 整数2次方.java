package com.test.DCAA;
/**
 * 用一条语句判断一个整数是不是2的整数次方
 *
 */
public class 整数2次方 {
public static void main(String[] args) {
	int N=8;
	System.out.println(Integer.toString(N, 2));
	
	if((((N-1)&N)==0)){	//N-1与上N  ==》可以消除最低位的1
		System.out.println("是");
	}
	else{System.out.println("不是");
	}
}
}
