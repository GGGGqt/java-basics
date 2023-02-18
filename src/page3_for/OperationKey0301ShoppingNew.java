package page3_for;

import java.util.Scanner;

public class OperationKey0301ShoppingNew {
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
		
		//定义输入变量
		Scanner scanner = new Scanner(System.in);
		//提示
		System.out.println("--欢迎来到商品换购系统--");
		
		while (true) {
			System.out.println("请输入本次消费的金额：");
			//因为是金额所以用double精度高一些
			double cost = scanner.nextDouble();
			
			//判断是否大于100
			if(cost >= 100) {
				//先显示提示内容
				System.out.println("恭喜获得换购资格：");
				while(true) {
					System.out.println("选项一：+1元换鼠标" );
					System.out.println("选项二：+5元换购键盘");
					System.out.println("选项三：+10元换购充电宝");
					System.out.println("选项四：+20换购移动硬盘");
					System.out.println("请输入选项对应的数字：");
					int item = scanner.nextInt();
					
					//1 2 3 4 其他
					if(item == 1) {
						System.out.println("换购鼠标成功！最终消费：" + (cost + 1) + "元" );
						break;
					}else if(item == 2) {
						System.out.println("换购键盘成功！最终消费：" + (cost + 5) + "元" );
						break;
					}else if(item == 3) {
						System.out.println("换购充电宝成功！最终消费：" + (cost + 10) + "元" );
						break;
					}else if(item == 4) {
						System.out.println("换购移动硬盘成功！最终消费：" + (cost + 20) + "元" );
						break;
					}else {
						System.out.println("选项有误");
					}
				}
					
			break;	//返回上一级菜单
			}else if(cost > 0 && cost < 100){
				System.out.println("本次消费总金额" + cost + "元");
				System.out.println("再见！！");
				break;
			}else {
				System.out.println("金额输入有误！！，请重新输入：");
			}
			
			
		}
		scanner.close();
	}
		
}
