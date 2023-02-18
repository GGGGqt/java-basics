package pages10_2;

import java.util.Random;

public class Wolf extends Enemy {

	public Wolf() {
		
	}
	
	public void appear(char [][] arr) {
		
		Random random = new Random();
		this.setRow(random.nextInt(2));
		this.setCol(random.nextInt(arr.length));
		arr[this.getRow()][this.getCol()] = this.getType();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

