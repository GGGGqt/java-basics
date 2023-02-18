package pages10_2;

import java.util.Random;

public class Game {
	
	public void run() {
		
		//成员变量初始化
		Mouse m = new Mouse();
		m.setName("地鼠");
		m.setType('M');
		m.setValue(10);
		
		Snake s = new Snake();
		s.setName("眼镜蛇");
		s.setType('S');
		s.setValue(20);
		
		Wolf w = new Wolf();
		w.setName("灰太狼");
		w.setType('W');
		w.setValue(30);
		
		Player p = new Player();
		Judge judge = new Judge();
		
		Random ran = new Random();
		
		//将三个敌人对象加入数组
		Enemy [] arr = {m,s,w};
		//arr[0]就是m		arr[1]就是s
		
		
		
		
		//欢迎提示语
		welcome();
		
		//地图的构建
		Cave cave = new Cave();
		
		System.out.println("地图初始化....");
		cave.initHoles();
		cave.showHoles();
		
		while (judge.getCount() < 5) {
			System.out.println();
			System.out.println("----------第" + (judge.getCount() + 1) + "次游戏----------");
			
			//出现敌人
			int index = ran.nextInt(arr.length);
			
			//arr[0]就是m		arr[1]就是s
			arr[index].appear(cave.getHoles());		
			System.out.println(arr[index].getName() + "出现！！！");
			System.out.println("|||||||||");
			System.out.println("|||||||||");
			System.out.println("|||||||||");
			System.out.println("vvvvvvvvv");
			cave.showHoles();
		
			//玩家击打
			p.hit();
			if (p.getRow() == 87) {
				System.out.println("退出游戏！！！");
				return;
			}else if (p.getRow() == 98) {
				System.out.println("游戏重新开始");
				
				//得分还原
				judge = new Judge();//初始化
				//地洞还原，就是地鼠出现的row和col变回O
				cave.getHoles()[m.getRow()][arr[index].getCol()] = 'O';
				continue;
				
			}
			
			//判断是否打中并统计分数
			judge.checkHit(p, arr[index]);
			System.out.println("当前得分：" + judge.getScore());
		
			//地洞还原，就是地鼠出现的row和col变回O
			cave.getHoles()[arr[index].getRow()][arr[index].getCol()] = 'O';
			
			
		}
		
		System.out.println("--------游戏结束-------");
		System.out.println("击中：" + judge.getHit());
		System.out.println("未击中：" + judge.getMiss());
		System.out.println("最终得分：" + judge.getScore());
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void welcome() {
		
		System.out.println("----------------------");
		System.out.println("---欢迎来到打地鼠游戏---");
		System.out.println("----------------------");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
