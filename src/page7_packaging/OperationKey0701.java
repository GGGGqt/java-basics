package page7_packaging;

import java.util.Scanner;

public class OperationKey0701 {
	public static void main(String[] args) {
		
		OperationKeylink0701 link = new OperationKeylink0701();
		
		/*
		 * 1、在main方法中根据键盘输入一个1-3000之间的数字n
		 * 另外写一个方法 showLope，传入这个n，循环n次“我爱你”
		 * 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个1-3000之间的数字：");
		int num = sc.nextInt();
		
		link.showLove(num);
		
		System.out.println();
		System.out.println("----------------------------");
		
		
		/*
		 * 2.在main方法中定义一个字符串
		 * 另外写一个方法ps，传入这个字符串
		 * 此方 法专门负责将传入的字符串打印出来。
		 * 
		 */
		
		String str = "我是个字符串";
		
		link.ps(str);
		
		System.out.println();
		System.out.println("----------------------------");
		
		/*
		 * 3.在main方法中定义一个数组
		 * 写一个方法showIntArr
		 * 专门用来遍历int类型的一维数组
		 * 
		 */
		
		int [] arr = {1,22,333,44,5};
		
		link.showIntArr(arr);
		
		System.out.println();
		System.out.println("----------------------------");
		
		
		/*
		 * 4.写一个方法showChararr，专门用来遍历char类型的一维数组。
		 * 5.写一个方法showStringarr，专门用来遍历String类型的一维数组。
		 * 
		 * 6.写一个万法showCharArr2，专门用来遍历char类型的二维数组
		 * 
		 * 只写第六题
		 */	
		
		char [][] chr = {
				{'1','2','3'},
				{'4','5','6'},
				{'7','8','9'}
			};
		
		link.showCharArr2(chr);
		
		System.out.println();
		System.out.println("----------------------------");
		
		
		/*
		 * 7.在main方法中有一个int类型一维数组
		 * 写一个方法findMax，用于获取数组中的最大值
		 * 调用方法之后将返回的最大值赋值给一个变量a
		 * 把a打印出来。
		 * 
		 */		
		int [] arr2 = {1,2,3,4,5,6};
		
		int a = link.findMax(arr2);
		System.out.println(a);
		
		System.out.println();
		System.out.println("----------------------------");
		
		
		
		/*
		 * 8.写一个方法findyeek
		 * 传入一个数字，来获取这个数字所对应的星期几字符串
		 * 在main方法中根据键盘输入一个数字（1-7）
		 * 调用这个方法来获取返回的字符串并赋值给s
		 * 打印出这个s
		 * 
		 */

		/*
		 * 9.在main方法中定义一个int类型的一维数组，根据键盘输入一个数字
		 * 写一个方法addNum
		 * 传入这个数字和数组，把这个数字加到这个数组的末尾
		 * 之后在main方法中调用addNum的方法把返回出来的数组赋值给原来的数组
		 * 并遍历原来的数组
		 * 
		 */
		int [] chr2 = {1,2,3,4,5};
		System.out.println("请输入一个数字：");
		int num2 = sc.nextInt();
		
		arr = link.addNum(num2,chr2);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("----------------------------");
		
		
		/* 
		 * 10.写一个方法sortMethod
		 * 用于对int类型一维数组进行冒泡排序 
		 * 
		 */
		
		
		
		
		
		
		sc.close();
		
		
	}
}
