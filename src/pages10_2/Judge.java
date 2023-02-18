package pages10_2;

public class Judge {

	private int count;	//游戏次数
	private int score;	//游戏分数
	private int hit;	//打中
	private int miss;	//未打中
	
	
	public Judge() {
		
	}

	//判断是否打中		地鼠出现的坐标和玩家输入的坐标进行对比
	//传对象		地鼠对象		玩家对象
	//或传参数	地鼠row和col		玩家row和col
	public void checkHit(Player p, Enemy en) {
		
		if (p.getRow() == en.getRow() && p.getCol() == en.getCol()) {
			
			System.out.println("恭喜你打中了" + en.getName());
			score += en.getValue();//加分
			hit++;//加打中次数
			
			
		}else {
			System.out.println("没有打中....");
			score -= 2;//减分
			miss++;
		}
		
		count++;//总次数统计
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getHit() {
		return hit;
	}


	public void setHit(int hit) {
		this.hit = hit;
	}


	public int getMiss() {
		return miss;
	}


	public void setMiss(int miss) {
		this.miss = miss;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
