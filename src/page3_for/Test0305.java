package page3_for;

public class Test0305 {
	/*
	 * 计算1-100偶数   
	 * 5个一行
	 * 
	 */
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				System.out.print(i + " ");
				count++;
			}
			if (count % 5 == 0) {
				System.out.println("");
			}
		}
		
		
		
		
		
		
		
		
	}
}
