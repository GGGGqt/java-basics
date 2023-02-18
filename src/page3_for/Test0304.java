package page3_for;

//for的嵌套

public class Test0304 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5 ;i++) {
			System.out.print("i:" + i);		//外层的for 控制行
			for (int j = 0; j < 5; j++) {
				System.out.print("0 ");		//控制列
				System.out.print("j:" + j);
			}
			System.out.println("");
		}
		
		
		
	}
}
