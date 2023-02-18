package page9_2;

import java.util.Random;

public class Mouse {

	private int row;
	private int col;
	private int value;//分值
	private char type;//类型
	private String name;
	
	
	public Mouse() {
		
		//可以在这里对老鼠进行实例化
		
		
	}

	public Mouse(int row, int col, int value, char type, String name) {
		super();
		this.row = row;
		this.col = col;
		this.value = value;
		this.type = type;
		this.name = name;
	}

	
	//成员方法
	//地鼠出现		就是随机的位置	把地洞O改成type的M
	public void appear(char [][] cave) {
		
		Random random = new Random();
		//因为是私密数据，但可以用标记的写法，的那进行区别
//		row = random.nextInt(5);
		this.setRow(random.nextInt(cave.length));
//		col = random.nextInt(5);
		this.setCol(random.nextInt(cave.length));
		
		//把地洞对应的row和col的位置改为M
//		cave[row][col] = 'M';
		cave[this.getRow()][this.getCol()] = this.getType();
		
		
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

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mouse [row=" + row + ", col=" + col + ", value=" + value + ", type=" + type + ", name=" + name + "]";
	}
	
	
	
	
	
}
