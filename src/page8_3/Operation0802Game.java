package page8_3;

public class Operation0802Game {
	
	/*
	 * 1.将猜拳游戏改造成面向对象版：玩家类，机器人类，裁判类，运行流程 的类，专门写放main方法的类
	 * 2.玩家类：玩家姓名，出拳数，出拳的方法
	 * 3.机器人类：名字，出拳数，上 出拳的方法
	 * 4.裁判类：名字，（玩家得分，电脑得分），判断胜负的方法 
	 * 5.游戏运行的类Gane：只有一个run方法
	 * 执行流程 
	 * 6.承载main方法的类 Test 
	 * 7.要求一开始玩家输入姓名开始游戏（sc.nextO方法输入字符串）
	 * 8.赢一局得2分，先到10分者获胜
	 * 9.8-重新开始，0-退出游戏
	 * 
	 */
	
	/*
	 * 解耦		程序的业务逻辑不要交叉
	 * 
	 * 属性的私有化
	 * 		问题：
	 * 			现在的 属性是共有的public类别
	 */
	
	public static void main(String[] args) {
		
		//程序入口
		Game game = new Game();
		game.run();
		//游戏
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
