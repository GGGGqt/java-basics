package page2_if;

import java.util.Scanner;

public class Operation0201Shopping {
	
	/*
	 * 满100元可参与换购
	 * 手动输入本次消费的金额；满100元可
	 * 选项一：+1元换鼠标
	 * 选项二：+5元换购键盘
	 * 选项三：+10元换购充电宝
	 * 选项四：+20换购移动硬盘
	 * 根据输入的选项来判断换购的商品，并显示最终消费
	 * 否则直接结算消费金额
	 * 
	 * 解析：
	 * 1.提示是否满100元，并用一个输入对象接收一下用户的输入
	 * 2.判断是否满100
	 * 		1.满足条件进入满足后的逻辑
	 * 			先显示提示内容：
	 * 				选项一：+1元换鼠标
	 * 				选项二：+5元换购键盘
	 * 				选项三：+10元换购充电宝
	 * 				选项四：+20换购移动硬盘
	 * 				继续等待用户输入 1 2 3 4
	 * 				再判断一些输入的是声明操作
	 * 				如果是1
	 * 					刚刚上面输入的金额+1 就是最终用户需要付款的金额
	 * 		2.不满足
	 * 			结束
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入金额：");
		
		int sc01 = scanner.nextInt();
		
		if (sc01 >= 100) {
			System.out.println("选项一：+1元换鼠标" );
			System.out.println("选项二：+5元换购键盘");
			System.out.println("选项三：+10元换购充电宝");
			System.out.println("选项四：+20换购移动硬盘");
			System.out.println("请选择");
			
			int select = scanner.nextInt();
			if(select == 1 || select == 2 || select == 3|| select == 4 ) {
				switch(select) {
				case 1:
					System.out.printf("你需要付 %d\n", sc01 + 1);
					break;
				case 2:
					System.out.printf("你需要付 %d\n", sc01 + 5);
					break;
				case 3:
					System.out.printf("你需要付 %d\n", sc01 + 10);
					break;
				case 4:
					System.out.printf("你需要付 %d\n", sc01 + 20);
					break;
				}
			}
			
			
			
		}else {
			System.out.println("不满足，结束");
		}
		
		
		System.out.println();
		
		scanner.close();
	}
	
	
	
	
}
