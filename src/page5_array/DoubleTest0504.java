package page5_array;

import java.util.Random;
import java.util.Scanner;

public class DoubleTest0504 {
	/*
	 * 1.初始化char类型的一维数组00000五个洞 
	 * 2.游戏循环10次 
	 * 3.随机角标，地鼠随机出现000XO 
	 * 4.提示玩家击打-输入数字（第几个洞）
	 * 5.判断是否打中
	 * 6.击中得2分，未击中扣1分（乱输入数字也视为没打中 
	 * 7.游戏结束，统计击中次数，未击中次数 和最后的得分。
	 * 8.中途可以按99重新开始，按88退出游戏
	 * 
	 */
	public static void main(String[] args) {

		//变量初始化
		Scanner sc = new Scanner(System.in);
		char [] chs = new char[10];
		Random random = new Random();
		int score = 0;      //得分
		int hit = 0;		//击中
		int miss = 0; 		//未击中
		
		//游戏提示
		System.out.println("------------------------");
		System.out.println("-----欢迎来到打地鼠------");
		System.out.println("------------------------");
		
		//地洞初始化
		for (int i = 0; i < chs.length; i++) {
			chs[i] = 'O';
			System.out.print(chs[i] + " ");
		}
		
		//地鼠出现
		System.out.println();
		System.out.println("地鼠出现啦");
		
		for (int j = 1; j <= 10; j++) {
			
			int index = random.nextInt(chs.length);
			chs[index] = 'X';
			
			for (int k = 0; k < chs.length; k++) {
				System.out.print(chs[k] + " ");
			}
			
			System.out.println();
			System.out.println("请输入打地鼠坐标：            99-重新开始    88-退出游戏");
			int player = sc.nextInt() - 1;
			
			if (player == 87) {
				System.out.println("再见");
				System.out.println("总得分："+ score);
				System.out.println("击中：" + hit);
				System.out.println("未击中：" + miss);
				break;
			}
			
			if (player == 98) {
				System.out.println("重新开始");
				score = 0;
				hit = 0;
				miss = 0;
				chs[index] = 'O';
				j = 1;
				continue;
			}
			
			if (player == index) {
				System.out.println("打中了");
				score += 2;
				hit ++;
			}else {
				System.out.println("未打中");
				score --;
				miss ++;
			}
			
			System.out.println("当前得分："+ score);
			
			System.out.println();
			
			//无论打中没有都要初始化
			for (int i = 0; i < chs.length; i++) {
				chs[i] = 'O';
			}
			
			
			
		}
		
		System.out.println("总得分："+ score);
		System.out.println("击中：" + hit);
		System.out.println("未击中：" + miss);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
