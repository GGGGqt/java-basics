package page4_twofor;

//for嵌套拆解分析

public class Test0401 {
	public static void main(String[] args) {
		
		System.out.println("0 0 0 0 0");
		System.out.println("0 0 0 0 0");
		System.out.println("0 0 0 0 0");
		System.out.println("0 0 0 0 0");
		System.out.println("0 0 0 0 0");
		
		System.out.println();
		System.out.println("------------------------------------------");
		
		//将这五行进行拆解，由五行的0 0 0 0 0来构成
		
		for (int i = 0; i <5; i++) {
			System.out.println("0 0 0 0 0");
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		
		//再次细化，我们的0 0 0 0 0可以由五个0 构成
		
		//外面决定有多少行
		for (int i = 0; i < 5; i++) {
			
			//里面决定多少列
			for (int j = 0; j <5; j++) {
				System.out.print("0 ");  //不换行的输出
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
