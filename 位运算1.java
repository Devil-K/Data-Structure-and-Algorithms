package com.test.DCAA;

import java.util.Arrays;
import java.util.Random;

/**
 * 异或：相当于不进位的加法 1+1=0  0+0=0 1+0=1
 * 
 * 题目：
 *1-1000放在含有1001个元素的数组中，只有唯一的一个元素值重复，
 *其它均只出现一次．每个数组元素只能访问一次，设计一个算法，将它找出来；
 *不用辅助存储空间，能否设计一个算法实现？
 */
public class 位运算1 {
	public static void main(String[] args) {
		int n=11;
		int[] arr=new int[n];		
		for(int i=0 ;i<arr.length-1;i++){
			arr[i]=i+1;
		}		
		arr[arr.length-1]=new Random().nextInt(n-1)+1;
		System.out.println(Arrays.toString(arr));
		//int index=new Random().nextInt(n);//随机下标 和最后一个交换位置
		
		int x1=0;
		for(int i=1;i<arr.length;i++){
			x1=x1^i;			
		}
		for(int i=0; i<arr.length;i++){
			x1=x1^arr[i];
		}
		System.out.println(x1);
		
		System.out.println("------方法二--------");
		int sum=0;int sum2=0;
		for (int i=0;i<arr.length;i++ ){
			sum+=arr[i];
		}	
		for (int i=0;i<arr.length-1;i++ ){
			sum2+=arr[i];
		}
		System.out.println(sum-sum2);
	}
	

}
