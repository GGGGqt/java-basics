package page6;

import java.util.Random;
import java.util.Scanner;

public class OperationKey0601 {
	
	//打地鼠升级版         二维列表
	
	/*
	 * 初始化char类型的二维数组4行5列），每个洞都是大写字母0 游戏循环10次 
	 * 地鼠随机出现在二维数组中的某个元素位置，即随机行与列，x
	 * 提示玩家击打。
	 * 输入行与列（两次 nextInt()) 
	 * 判断是否打中 
	 * 击中得2分，未击中扣1分（乱输入数字也视为没打中）
	 * 游戏结束，统计击中次数，未击中次数
	 * 和最后的得分。
	 * 中途可以 只输入行 99重新开始，只输入行88退出游戏
	 * 
	 */
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
		
		//spilt
//		String [] inputString = new String[2];
		
		//游戏提示
		System.out.println("------------------------");
		System.out.println("-----欢迎来到打地鼠------");
		System.out.println("------------------------");
				
		//初始化地洞
		for (int i = 0; i < chr.length; i++) {
			for (int j = 0; j < chr[i].length; j++) {
				chr[i][j] = 'O';
				System.out.print(chr[i][j] + " ");
			}
			System.out.println();
		}
		
		//地鼠出现
		System.out.println();
		System.out.println("地鼠出现啦");
		
		//10次游戏的计数
		for (int i = 1; i <= 10; i++) {
			
			//随机出现地鼠的位置 把O改成X
			mouseRow = random.nextInt(chr.length);
			mouseCol = random.nextInt(chr[mouseRow].length);
			
			chr[mouseRow][mouseCol] = 'X';
			
			//在地图中显示地鼠的位置
			for (int j = 0; j < chr.length; j++) {
				for (int j2 = 0; j2 < chr[j].length; j2++) {
					System.out.print(chr[j][j2] + " ");
				}
				System.out.println();
			}
			
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
				score += 2;
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
		
		//游戏结束统计：
		System.out.println("-----------------");
		System.out.println("-----游戏结束-----");
		System.out.println("总得分："+ score);
		System.out.println("击中：" + hit);
		System.out.println("未击中：" + miss);
		
		
		
		scanner.close();
		
		
		
		
		


		
		
		
		
		
	}

	
}
