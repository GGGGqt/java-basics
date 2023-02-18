package page2_if;

import java.util.Random;

public class Test0206 {
	public static void main(String[] args) {
		/*
		 * 随机数：
		 * Random 
		 * 
		 */
		
		Random ran = new Random(); //实例化Random对象
		int num = ran.nextInt(10); //范围是0-9
		int num2 = ran.nextInt(10)+1; //范围是1-10
		System.out.println(num);
		System.out.println(num2);
		
	}
}
