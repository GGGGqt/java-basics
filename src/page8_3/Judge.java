package page8_3;

public class Judge {

	public String judgeName;	//裁判名字
	public int playerScore;		//玩家分数
	public int robotScore;		//电脑分数
	
	
	public Judge() {
		
	}


	public Judge(String judgeName, int playerScore, int robotScore) {
		super();
		this.judgeName = judgeName;
		this.playerScore = playerScore;
		this.robotScore = robotScore;
	}


	//裁判的方法		输赢		输赢+得分	得分		程序的解耦
	public int win(int playNum,Robot robot) {
		
		if(playNum == 1 && robot.robotNum == 2 || playNum == 2 && robot.robotNum == 3 || playNum == 3 && robot.robotNum == 1) {
			
			
			return 0;//玩家赢
		}else if (playNum == robot.robotNum) {
			return 2;//平局
		}else {
			return 1;//机器人赢
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Judge [judgeName=" + judgeName + ", playerScore=" + playerScore + ", robotScore=" + robotScore + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
