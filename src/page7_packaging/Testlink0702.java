package page7_packaging;

public class Testlink0702 {
		public void gameHello() {
			//游戏提示
			System.out.println("------------------------");
			System.out.println("-----欢迎来到打地鼠------");
			System.out.println("------------------------");
		}

		
		public void initHole(char [][] chr) {
			//初始化地洞
			for (int i = 0; i < chr.length; i++) {
				for (int j = 0; j < chr[i].length; j++) {
					chr[i][j] = 'O';
					System.out.print(chr[i][j] + " ");
				}
				System.out.println();
			}
		}

		
		public void shoeMouse(char [][] chr, int mouseRow, int mouseCol) {
			
			chr[mouseRow][mouseCol] = 'X';
			
			//在地图中显示地鼠的位置
			for (int j = 0; j < chr.length; j++) {
				for (int j2 = 0; j2 < chr[j].length; j2++) {
					System.out.print(chr[j][j2] + " ");
				}
				System.out.println();
			}	
		}

		
		public void gameEnd(int score, int hit, int miss) {
			
			//游戏结束统计：
			System.out.println("-----------------");
			System.out.println("-----游戏结束-----");
			System.out.println("总得分："+ score);
			System.out.println("击中：" + hit);
			System.out.println("未击中：" + miss);
			
		}

		
//方法的封装   计算的方法 ，不要打印，而是要返回回去给后面的程序使用
		public int countS(int score) {
			score += 2;
			
			return score;
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
