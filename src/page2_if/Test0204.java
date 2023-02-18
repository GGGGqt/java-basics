package page2_if;

import java.util.Scanner;

public class Test0204 {
	public static void main(String[] args) {
		/*
		 * Scanner  系统输入对象，从控制台输入
		 * 
		 * 使用：
		 * 先实例化：new 出 scanner对象
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * 使用scanner 里面的方法
		 * 
		 * scanner.next(); 输入字符串使用
		 */
		
		System.out.println("欢迎进入洗浴中心，请输入你的性别：");
		Scanner scanner = new Scanner(System.in);
		
		String sex = scanner.next();
		switch(sex) {
		case "男":
			System.out.println("请进入男嘉宾区...");
			break;
		case "女":
			System.out.println("请进入女嘉宾区...");
			break;
		default:
			System.out.println("难道你去过泰国？？？");
			break;
		
		}
		scanner.close();
	}
}
