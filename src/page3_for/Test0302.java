package page3_for;

import java.util.Scanner;

public class Test0302 {
	/*while循环（当型循环）
	 * 
	 * [initialization]			初始化条件
	 * while (termination){		循环条件
	 * 		body;         		循环体
	 * 		[iteration;] 		迭代，变更循环条件
	 * }
	 * 
	 * 当表达式termination为true时执行{}中的语句，否则终止循环
	 */
	
	/*
	 * do-while循环（直到型循环）
	 * 
	 * [initialization]			初始化条件
	 * do{
	 * 		body；				循环体
	 * 		[iteration;] 		迭代，变更循环条件
	 * }while(termination);		循环条件
	 * 
	 * 首先执行一遍{}中的语句，当表达式termination为true时，继续执行{}中的语句，否则终止循环
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;  //控制循环的
		while (i < 5) {
			System.out.println("0 0 0 0 0");
			int num = sc.nextInt();
			if (num == 0) {		//控制程序的退出操作
				System.out.println("退出");
				System.exit(0);  //退出
			}
			//迭代器
			i++;
			
		}
		
		/*
		 * System.exit(status);
		 * 正常终止当前运行的Java虚拟机：System.exit(0)
		 * 异常终止当前运行的Java虚拟机：System.exit(非零的int型参数)
		 * 
		 * */
		
		
		
		
		sc.close();
	}
	
	
	
	
	
}
