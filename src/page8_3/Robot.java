package page8_3;

import java.util.Random;


public class Robot {

	public String robotName;	//电脑名字
	public int robotNum;	//出拳数
	
	
	
	public Robot() {
		
	}
	
	
	public Robot(String robotName, int robotNum) {
		this.robotName = robotName;
		this.robotNum = robotNum;
	}
	
	
	//私有方法
	public int Finger() {		
		Random ra = new Random();
		robotNum = ra.nextInt(3) + 1;
		
		return robotNum;
	}
	
	
	//还要展示出拳显示到控制台，来看过程，因为出拳是数字，但人看到是中文
	public String showFinger(int robotNum) {
		
		if (robotNum == 1) {
			return "石头";
		}else if(robotNum == 2){
			return "剪刀";
		}else {
			return "布";
		}
		
	}


	@Override
	public String toString() {
		return "Robot [robotName=" + robotName + ", robotNum=" + robotNum + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
