package page5_array;

import java.util.Random;

public class OperationKey0504 {
	/*
	 * 4.随机10个（1-100之间）的整数，放进数组中，遍历出
	 * 然后将角标为奇数 的元素的值翻倍，再遍历一遍。
	 * 
	 */
	
	public static void main(String[] args) {
		
		//随机10个1-100的数，放入数组
		//定义一个10个位置的数组
		int [] srcArr = new int[10];
		Random random = new Random();
		
		for (int i = 0; i < srcArr.length; i++) {
			srcArr[i] = random.nextInt(100) + 1;
			System.out.print(srcArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		
		for (int i = 0; i < srcArr.length; i++) {
			if (i % 2 != 0) {
				srcArr[i] *= 2;
			}
			System.out.print(srcArr[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
