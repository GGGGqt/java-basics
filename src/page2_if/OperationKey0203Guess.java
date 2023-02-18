package page2_if;

import java.util.Scanner;
import java.util.Random;

public class OperationKey0203Guess {
	/*
	 * 1.玩家出拳 判断出拳文字（判断玩家输入有误情况）
	 * 2.电脑出拳 判断出拳的文字
	 * 3.判断胜负
	 * 
	 */
	
	public static void main(String[] args) {
		
		//定义输入变量
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();  //随机数的实例化
		
		System.out.println("-欢迎来到猜拳游戏-");
		System.out.println("请出拳：1-石头 2-剪刀 3-布");
		int player = scanner.nextInt();
		
		//判断 出拳的数字  123 其他
		
		//正确的出拳
		if(player >= 1 && player <=3) {
			//判断玩家出的是什么
			if(player == 1) {
				System.out.println("玩家出：石头");
			}else if(player == 2) {
				System.out.println("玩家出：剪刀");
			}else if(player == 3) {
				System.out.println("玩家出：布");
			}
			
			//电脑出拳
			int com = random.nextInt(3) + 1;//随机数1 2 3
			if(com == 1) {
				System.out.println("电脑出：石头");
			}else if(com == 2) {
				System.out.println("电脑出：剪刀");
			}else if(com == 3) {
				System.out.println("电脑出：布");
			}
			
			//判断电脑和玩家谁赢
			//平局  玩家赢 其他
			if(player == com ) {
				System.out.println("平局");
			}else if(player == 1 && com == 2 || player == 2 && com == 3 || player == 3 && com == 1) {
				System.out.println("玩家赢");
			}else {
				System.out.println("电脑赢");
			}
			
			
			
			
			
		}else {
			System.out.println("出拳有误");
		}
		
		
		scanner.close();
	}
	
	
	
	
	
}
