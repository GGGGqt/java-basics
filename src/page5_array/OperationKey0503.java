package page5_array;

import java.util.Scanner;

public class OperationKey0503 {
	/*
	 * 3.将星期一到星期日放进数组中String[]
	 * 根据键盘输入一个数字，来打印对应的星期数。
	 * 
	 */
	
	public static void main(String[] args) {
		
		//原来的数组
		String [] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("请输入1-7的数字         886-退出");
			int num = sc.nextInt() - 1;
			//第一种
			/*
			 * switch(num){
			 * 
			 * 	case 1:
			 * 		....
			 * 
			 * }
			 * 
			 * 比较麻烦
			 */
			
			//第二种
			if (num >= 0 && num < arr.length) {
				
				System.out.println(arr[num]);
				
			}else if((num+1) == 886){
				System.out.println("退出");
				break;
			}else {
				System.out.println("输入有误");
			}
			
			
			
		}
			sc.close();
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
