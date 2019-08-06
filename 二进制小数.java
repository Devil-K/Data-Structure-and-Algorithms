package com.test.DCAA;
/**
 * 将一个小数用二进制表示
 *
 */
public class 二进制小数 {
public static void main(String[] args) {
	double a=0.625;
	StringBuilder num=new StringBuilder("0.");
	
	while(a>0){
		double b=a*2;
		if(b>=1){
			num.append("1");
			a=b-1;
		}else{
			num.append("0");
			a=b;
		}
		
		if(num.length()>34){
			System.out.println("错误");
			break;
		}
	}
	System.out.println(num.toString());
}
}
