package page5_array;

import java.util.Scanner;

public class OperationKey0502 {
	/*
	 * 2.数组的动态增长：
	 * 创建一个int类型的一维数组oldArr，初始有3个数（例如11,12,13)
	 * 根据键盘输入一个数x，将x加到这个数组的末尾(
	 * 需要创建一个新数组newArr)，并遍历newArr。
	 */
	/*
	 * 2-1进阶：
	 * 能够循环一直输入数字，不断添加到末尾，每次都遍历出新数 组，如果输入0，则结束循环输出-退出系统。
	 */
	
	public static void main(String[] args) {
		
		//原来的数组
		int [] oldArr = {11,12,13};
		Scanner sc = new Scanner(System.in);
		System.out.println("oldArr:");
		
		for (int i = 0; i < oldArr.length; i++) {
			System.out.print(oldArr[i] + " ");
		}
		
		System.out.println();
		
		//加入循环条件
		
		while(true) {
			
			System.out.println("请输入一个数字：           0-退出");
			int num = sc.nextInt();
			
			if (num == 0) {
				System.out.println("退出");
				break;
			}else {
				//创建新数组
				int [] newArr = new int[oldArr.length + 1];
				
				//把原来的值复制过去
				for (int i = 0; i < newArr.length; i++) {
					if (i < newArr.length-1) {
						newArr[i] = oldArr[i];
					}else {
						newArr[i] = num;
					}
				}
				
				System.out.println("新数组：");
				for (int i = 0; i < newArr.length; i++) {
					System.out.print(  newArr[i] + " ");
				}
				
				//把新的数组传递给旧的，实现保存新数组操作
				/*
				 *这一步实现 2-1进阶：
				 */
				oldArr = newArr;
			}
				
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
