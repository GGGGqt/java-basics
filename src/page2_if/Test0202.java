package page2_if;

public class Test0202 {
	public static void main(String[] args) {
		/*
		 * 格式：
		 * 		if(布尔表达式){
		 * 			statements
		 * 		}else{
		 * 			statements
		 * 		}
		 * 		else可以不写
		 * 
		 * 
		 * 
		 */
		
		int num = 10;
		if(num > 3) {
			System.out.println("10大于3");
		}else {
			System.out.println("其他结果");
		}
		
		//嵌套
		if(num > 5) {
			if(num > 5) {
				System.out.println("num > 5");
			}
		}
		
//if(num > 6){System.out.println("num > 6");)
//这样写法不会报错，但是不推荐
		
		/*
		 * 格式：
		 * 		if(布尔表达式){
		 * 			statements
		 * 		}else if(布尔表达式){
		 * 			statements
		 * 		}else{
		 * 
		 * 		}
		 * 	
		 * 这个一般用在多个条件需要对比的情况下
		 *  案例：输入一个分数提取等级
		 * 
		 */
		
		int score = 60;
		if(score >= 0 & score <= 100) {
		
			if(score > 90) {
			System.out.println("优秀");
		}else if(score > 80) {
			System.out.println("中等");
		}else if(score > 70) {
			System.out.println("良");
		}else if(score > 60) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
			
		}else {
			System.out.println("数据错误");
		}
		
		
		
		
		
		
		
		
	}
}
