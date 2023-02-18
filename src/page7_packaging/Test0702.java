package page7_packaging;

import java.util.Random;
import java.util.Scanner;

public class Test0702 {
	public static void main(String[] args) {
		
		//变量初始化
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		int hit = 0;
		int miss = 0;
		int mouseRow = 0;
		int mouseCol = 0;
		int playRow = 0;
		int playCol = 0;
		char [][] chr = new char[5][5];
		
		Testlink0702 testlink = new Testlink0702();
		
		//spilt
//		String [] inputString = new String[2];
		
		testlink.gameHello();
				
		testlink.initHole(chr);
		
		//地鼠出现
		System.out.println();
		System.out.println("地鼠出现啦");
		
		//10次游戏的计数
		for (int i = 1; i <= 10; i++) {
			
			//随机出现地鼠的位置 把O改成X
			mouseRow = random.nextInt(chr.length);
			mouseCol = random.nextInt(chr[mouseRow].length);
			
			testlink.shoeMouse(chr, mouseRow, mouseCol);
			
			System.out.println();
			System.out.println("-------------------------------------");
			
			System.out.println("请输入打地鼠坐标：            99-重新开始    88-退出游戏");
			
			//spilt分割使同时输入两个数字可以分割
			
//			inputString = scanner.next().split(",");  //用，来分割字符串，放回一个字符串的数组
//			
//			for (int j = 0; j < inputString.length; j++) {
//				System.out.println(inputString[j] + " ");
//			}
//			inputString[0] == 87
//			inputString[0] == mouseRow && inputString[1] == mouseCol
			
			//获取第一次输入，可以是坐标也可以是选项
			playRow = scanner.nextInt() -1;
			
			if (playRow == 87) {
				System.out.println("再见");
				break;
			}
			
			if (playRow == 98) {
				System.out.println("重新开始");
				score = 0;
				hit = 0;
				miss = 0;
				chr[mouseRow][mouseCol] = 'O';
				i = 1;
				continue;
			}
			
			//用户打击的位置纵坐标
			playCol = scanner.nextInt() - 1;
			
			if (playRow == mouseRow & playCol == mouseCol) {
				System.out.println("打中了");
//				score += 2;
				
				score = testlink.countS(score);
				
				hit ++;
			}else {
				System.out.println("未打中");
				score --;
				miss ++;
			}
			
			
			//不管是否打中都要还原
			chr[mouseRow][mouseCol] = 'O';
			
			System.out.println("当前得分："+ score);
			
		}
		
		testlink.gameEnd(score, hit, miss);
		
		
		
		scanner.close();

		
		
	}
}
