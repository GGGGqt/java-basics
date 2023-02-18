package page8_3;

import java.util.Scanner;

public class Game {

	public void run() {
		
		//欢迎
		welcome();  //就是this.welcome();
		System.out.println("请输入你的名字：");
		
		//输入玩家名字
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.next();
		
		//游戏开始
		//游戏对象初始化		玩家，电脑
		Player player = new Player();
		
		player.playerName = playerName;
		
		Robot robot = new Robot("AI", 0);
		Judge judge = new Judge("蜻蜓队长",0,0);
		
		while (judge.playerScore < 10 && judge.robotScore < 10) {
			
			System.out.println("请出拳：1-石头 2-剪刀 3-布   8-退出  9-重新开始");
			
			int playerNum = player.Finger();
			int robotNum = robot.Finger();
			
			if (playerNum == 8) {
				System.out.println("游戏结束");
				break;
			}else if (playerNum == 9) {
				
				judge.playerScore = 0;
				judge.robotScore = 0;
				System.out.println("游戏重新开始！！");
				
			}else if(playerNum >= 1 && playerNum <= 3){
				//显示出拳
				String pf = player.showFinger(playerNum);
				String rf = robot.showFinger(robotNum);
				System.out.println(player.playerName + "出" + pf);
				System.out.println(robot.robotName + "出" + rf);
				
				//判断出拳
				int win = judge.win(playerNum, robot);
				
				//游戏的得分机制，要和胜负分开
				if (win == 0) {
					System.out.println(judge.judgeName + "判定此局是" + playerName + "胜利");
					judge.playerScore += 2;
				}else if (win == 1) {
					System.out.println(judge.judgeName + "判定此局是" + robot.robotName + "胜利");
					judge.robotScore += 2;
				}else {
					System.out.println(judge.judgeName + "判定平局");
				}
				
				System.out.println("当前比分：" + judge.playerScore + ":" + judge.robotScore);
				
			}else {
				System.out.println("输入有误");
				continue;
			}
			
			//游戏结束
			if (judge.playerScore == 10 ) {
				System.out.println("最后是" + player.playerName + "胜利");
				System.exit(0);
			}else if (judge.robotScore == 10) {
				System.out.println("最后是" + player.playerName + "胜利");
				System.exit(0);
			}
			
			
		}
		
		scanner.close();
	}

	public void welcome() {
		
		System.out.println("--------------------");
		System.out.println("---欢迎来到猜拳游戏---");
		System.out.println("--------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
