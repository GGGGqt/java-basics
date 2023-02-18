package page3_for;

import java.util.Scanner;

public class OperationKey0302TicketNew {
	/*
	 * 假设机票的原价是1000元
	 * 	根据淡季，旺季以及头等舱，经济舱 来判断机票的最终价格。
	 * 	首先用户输入选择旅游的月份：
	 * 	然后继续输入选择舱位：1头等舱2经济舱
	 * 	最后显示最终的机票价格
	 * 	若输入其他数字则提示信息输入有误并结束程序
	 * 	注：567月,910 11月为旺季，其他为淡率
	 * 	淡季经济舱打6折，头等舱打7折
	 * 	旺季经济舱扣8折，头等舱打9折
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		//定义输入变量
		Scanner scanner = new Scanner(System.in);
		double price = 1000;
		double sale1 = 0.6;
		double sale2 = 0.7;
		double sale3 = 0.8;
		double sale4 = 0.9;
		
		System.out.println("--欢迎使用机票订购系统--");
		
		while(true) {
			
			System.out.println("请输入要出行的月份：");
			
			int month = scanner.nextInt();
			//判断 1-12 其他
			//旺季：5 6 7 9 10 11 非法输入           其他：淡季
			if( (month >= 5 && month <= 7) || (month >= 9 && month <= 11) ) {
				while(true) {
					//旺季
					System.out.println("请选择舱位：1-头等舱   2-经济舱");
					int item = scanner.nextInt();
					if(item == 1) {
						System.out.println("订购头等舱成功！最终的价格是：" + price * sale3 + "元");
						break;
					}else if(item == 2) {
						System.out.println("订购经济舱成功！最终的价格是：" + price * sale4 + "元");
						break;
					}else {
						System.out.println("输入有误");
					}
				}
				
				break;
			}else if(month < 1 || month > 12){
				
				System.out.println("月份输入有误");
				
			}else {
				while(true) {
					//淡季
					System.out.println("请选择舱位：1-头等舱   2-经济舱");
					int item = scanner.nextInt();
					
					if(item == 1) {
						System.out.println("订购头等舱成功！最终的价格是：" + price * sale1 + "元");
						break;
					}else if(item == 2) {
						System.out.println("订购经济舱成功！最终的价格是：" + price * sale2 + "元");
						break;
					}else {
						System.out.println("输入有误");
					}
				}
				break;
			}
		}
		
		scanner.close();
	}
}
