package page9_2;

import java.util.Arrays;

public class Cave {

	private char [][] holes;	//地洞

	
	
	//构造方法
	public Cave() {
		
//		holes = new char[5][5];
//		for (int i = 0; i < holes.length; i++) {
//			for (int j = 0; j < holes[i].length; j++) {
//				holes[i][j] = 'O';
//			}
//		}
	}



	public Cave(char[][] holes) {
		this.holes = holes;
	}

	//成员方法	私有方法
	
	//初始化地图的数据
	public void initHoles() {
		holes = new char[5][5];
		for (int i = 0; i < holes.length; i++) {
			for (int j = 0; j < holes[i].length; j++) {
				holes[i][j] = 'O';
			}
		}
	}
	
	//展示地图
	public void showHoles() {
		for (int i = 0; i < holes.length; i++) {
			for (int j = 0; j < holes[i].length; j++) {
				System.out.print(holes[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	//看数据和该数据
	public char[][] getHoles() {
		return holes;
	}



	public void setHoles(char[][] holes) {
		this.holes = holes;
	}



	@Override
	public String toString() {
		return "Cove [holes=" + Arrays.toString(holes) + "]";
	}
	
}
