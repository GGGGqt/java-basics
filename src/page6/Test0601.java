package page6;

import java.util.Random;

public class Test0601 {
	
	//多维数组
	
	public static void main(String[] args) {
		
		//静态方式定义
		int [][] array = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//可以类比成一个表格
		
		System.out.println(array);			//[[I@15db9742
		System.out.println(array[0]);		//[I@6d06d69c
		System.out.println(array[0][0]); 	//代表第一个数组里面的第一个值，用坐标概念就是（0，0）
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		//动态方式定义
		int [][] array2 = new int[3][3];
		Random random = new Random();
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				array2[i][j] = random.nextInt(10) + 1;
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		
		//动态添加
		int [] arr1 = {1,2,3};
		int [] arr2 = new int[3];
		int [] arr3 = {10,20,30};

		int [][] array3 = {arr1,arr2,arr3};
		
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3.length; j++) {
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
