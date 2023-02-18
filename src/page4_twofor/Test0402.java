package page4_twofor;

public class Test0402 {
	public static void main(String[] args) {
		
		//三角形
		for (int i = 0; i < 5; i++) {
			for (int j = 0 ;j <= i; j++) {
				System.out.print("0 ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		System.out.println("-------------------------------------");
		
		//倒三角
		for (int i = 4; i >=0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("0 ");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------");
		
		//反三角
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5-i; k++) {
				System.out.print("##");
			}
			for (int j = 0 ;j <= i; j++) {
				System.out.print("0 ");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------");
		
		//锥形
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5-i; k++) {
				System.out.print("#");
			}
			for (int j = 0 ;j <= i; j++) {
				System.out.print("0 ");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------");
		
		//上三角
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5-i; k++) {
				System.out.print("##");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("0 ");
			}
			for (int a = 0;a < i; a++) {
			System.out.print("0 ");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------");
		
		//菱形
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5-i; k++) {
				System.out.print(" ");
			}
			for (int j = 0 ;j <= i; j++) {
				System.out.print("0 ");
			}
			System.out.println("");
		}
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k <= i+1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 4-i; j++) {
				System.out.print("0 ");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------");
			
		//九九乘法表
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "x" + i  + "=" + (j*i) + " ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
