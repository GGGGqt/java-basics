package page8_3;

import java.util.Scanner;

public class Player {
	
	public String playerName;	//玩家名字
	public int playNum;	//出拳数
	
	
	//构造方法
	
	public Player() {
		
	}


	public Player(String playerName, int playNum) {
		this.playerName = playerName;
		this.playNum = playNum;
	}


	
	
	//私有方法
	
	Scanner sc = new Scanner(System.in);
	public int Finger() {		//出拳给裁判看，所以要直接返回出拳数
		
		playNum = sc.nextInt();
		
		
		
		return playNum;
		
	}
	
	
	//还要展示出拳显示到控制台，来看过程，因为出拳是数字，但人看到是中文
	public String showFinger(int playerNum) {
		
		if (playerNum == 1) {
			return "石头";
		}else if(playerNum == 2){
			return "剪刀";
		}else {
			return "布";
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "player [playerName=" + playerName + ", playNum=" + playNum + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
