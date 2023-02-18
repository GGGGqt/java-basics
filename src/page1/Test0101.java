package page1;

/*
 * doc文档
 * 对这个类的描述
 * @author 龙猫老师
 * 时间：20220802
 * 作业：
 */
public class Test0101 {
	
//main函数  主程序的入口，程序从这里开始，没有直接报错
//public共有的，static返回值为，void空
//main alt+/
	public static void main(String[] args) {
//sout alt+/
		System.out.println("你好java");  //带换行的输出
		System.out.println("你好java");
		System.out.print("挺好");    //不带换行的输出
		System.out.print("挺好"); 
		System.out.println();
		
		//设置格式
		int a = 1;
		System.out.format("a=%5d",a);
		System.out.println();
		
//格式：数据类型  变量 = 值
		byte num1 = 55;
		System.out.println(num1);
		
		short num2 = 1000;
		System.out.println(num2);
		
		int num3 = 2000;
		System.out.println(num3);
		
		long num4 = 64616546195l;  //数据非常大的情况下，long类型需要在最后加l
		System.out.println(num4);
		
		float num5 = 9999.999f;    //单精度的小数类型，最后加一个f
		System.out.println(num5);
		
		double num6 = 99999.9999;  //双精度的小数类型，精准度比float高，一般使用到金额
		System.out.println(num6);
		
		//字符类型
		char c = 'a';  //一般用单引号，只能是一个字符
		System.out.println(c);
		
		boolean flag = true; //只有true和false
		System.out.println(flag);
		
		//为什么没有String???
		//String 是一个对象，它不属于8种基本数据类型中的任意一个
		String name = "班级";
		System.out.println(name);
		
		
	}
}
