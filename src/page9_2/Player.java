package page9_2;

import java.util.Scanner;

public class Player {
	
	private int row;
	private int col;
	
	public Player() {
		
	}

	//玩家的打击方法
	Scanner sc = new Scanner(System.in);
	
	public void hit() {
		
		System.out.println("请输入行和列   88-退出   99-出现开始");//可以写在游戏流程中
		
		row = sc.nextInt() - 1;
		if (row == 87 || row == 98) {
			return;
		}
		col = sc.nextInt() - 1;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	
	
	
	
	
}
