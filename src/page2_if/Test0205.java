package page2_if;

import java.util.Scanner;

public class Test0205 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入你的第一科分数：");
		
		int sc01 = scanner.nextInt();
		
		System.out.println("请输入你的第二科分数：");
		
		int sc02 = scanner.nextInt();
		
		//以下没有小数部分，（61+60）/2就显示60
		int res = (sc01 + sc02) / 2;
		System.out.println("你的平均分是："+ res);
		
		//以下有小数部分，但不准确也显示60
		double res1 = (sc01 + sc02) / 2;
		System.out.println("你的平均分是："+ res1);
	
		//以下有小数部分且准确显示60.5
		//右边的(double)是强制转换，因为sc01和sc02都是int类型
		//强制转换：(转换后)(转换前)
		double res3 = (double)(sc01 + sc02) / 2;
		System.out.println("你的平均分是："+ res3);
		
		scanner.close();
	} 
	
}
