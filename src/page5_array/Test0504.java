package page5_array;

import java.util.Random;
import java.util.Scanner;

public class Test0504 {
	
	//打地鼠游戏
	
	public static void main(String[] args) {
		
		
		String[] cave = new String[5];
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--欢迎来到打地鼠游戏--");
		System.out.println("游戏初始化...");
		
		//初始化地洞
		for (int i = 0; i < cave.length; i++) {
			cave[i] = "O ";
		}
		//打印地洞
		for (int i = 0; i < cave.length; i++) {
			System.out.print(cave[i]);
		}
		
		System.out.println("地鼠马上出现了！！");
		
		//随机数
		int mouseX = random.nextInt(5);
		cave[mouseX] = "X ";
		
		//地鼠出现以后的位置
		for (int i = 0; i < cave.length; i++) {
			System.out.print(cave[i]);
		}
		System.out.println("地鼠出现，输入位置打击！！！");
		int player = scanner.nextInt() - 1;
		if (player == mouseX) {
			System.out.println("恭喜打到了！！");
		}else {
			System.out.println("加油吧");
		}
		
		
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
