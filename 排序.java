package com.test.DCAA;

import java.util.Arrays;

public class 排序 {
	public static void main(String[] args) {
		int[] a = { 4, 2, 3, 1, 5, 3 };
		// 0 1 2,3
		int k=10;
		arraySum(a, k);
		 paixu(a);
		 System.out.println(a.length/2);
		paipai(a);
	}

	
	
	public static void paixu(int[] arr) {//希尔排序
		for (int interval = arr.length / 2; interval > 0; interval = interval / 2) {
			for (int i =interval; i < arr.length; i++) {
				int target = arr[i];//
				int j = i - interval;//
				while (j > -1 && target < arr[j]) {//
					arr[j + interval] = arr[j];
					j--;
				}
				arr[j + interval] = target;
			}
		}			System.out.println(Arrays.toString(arr));

	}

	// int[] a={4,2,3,1,5,3};
	public static void paipai(int[] b) {//插入排序
		for (int i = 1; i < b.length; i++) {
			int target = b[i];
			int j = i - 1;
			while (j > -1 && target < b[j]) {
				b[j + 1] = b[j];
				j--;
			}
			b[j + 1] = target;

		}
		System.out.println(Arrays.toString(b));

	}

public static void arraySum(int arr[],int k)
    {
        if(arr==null||arr.length<3)
            return;
        for(int i=0;i<arr.length-2;i++)
        {       

            int left=i+1,right=arr.length-1;
            while(left<right)
            {
                if(arr[i]+arr[left]+arr[right]==k)
                {
                    System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
                    left++;
                    right--;
                }
                else if(arr[i]+arr[left]+arr[right]<k)
                {
                    left++;
                }
                else {
                    right--;
                }
                }
            }

  }
}
