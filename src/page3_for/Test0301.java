package page3_for;

public class Test0301 {
	/*for循环
	 * 
	 * for(initiation;termination;iteration)
	 * {
	 * 		body;  //循环体
	 * }
	 * 
	 * initiation	初始化条件
	 * termination	循环条件
	 * iteration	迭代，变更循环条件
	 * 
	 */
	
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
		
		for (int i = 0; i < 5; i++) {
			//int i = 0 只执行一次
			//i < 5 单满足这个条件时进入循环
			//i++ 就是 i = i + 1
			System.out.println("0 0 0 0 0" + "--" + i);
			
		}
		System.out.println("循环结束\n");
		
		//break; 可强制跳出
		
		for (int i = 0; i < 10; i++) {
			System.out.println("0 0 0 0 0" + "--" + i);
			if(i == 7) {
				break;
			}
		}
		
		//continue;  继续循环与break相反
		
		//return; 终止循环和break相似，但会跳出本次代码的方法
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
