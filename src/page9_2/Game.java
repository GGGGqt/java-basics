package page9_2;

public class Game {
	
	public void run() {
		
		Mouse m = new Mouse();
		m.setName("地鼠");
		m.setType('M');
		m.setValue(10);
		
		Player p = new Player();
		Judge judge = new Judge();
		
		//欢迎提示语
		welcome();
		
		//地图的构建
		Cave cave = new Cave();
		
		System.out.println("地图初始化....");
		cave.initHoles();
		cave.showHoles();
		
		while (judge.getCount() < 5) {
			//出现地鼠
			m.appear(cave.getHoles());
			System.out.println(m.getName() + "出现！！！");
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
				cave.getHoles()[m.getRow()][m.getCol()] = 'O';
				continue;
				
			}
			
			//判断是否打中并统计分数
			judge.checkHit(p, m);
			System.out.println("当前得分：" + judge.getScore());
		
			//地洞还原，就是地鼠出现的row和col变回O
			cave.getHoles()[m.getRow()][m.getCol()] = 'O';
			
			
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
