package page1;

public class Test0102 {

	public static void main(String[] args) {
		/*
		 * 变量运算：
		 * 
		 *  算术运算符 + - * %(取余) 
		 * 
		 */
		//变量的初始化
		int m = 10;
		int m2 = 13;
		int result ; //如果int没有直接定义具体的值，那么默认int就是0，但是尽量都定义好
		
		// 和
		result = m + m2;
		
		// 差
		result = m2 - m;  // 现在的result会覆盖掉原来的值
		
		// 称
		result = m * m2;
		
		// 商
		result = m2 / m;  //因为int没有小数点，所以默认直接舍去，这样的方式不可取，最好使用浮点类型
		
		// 取余
		result = m2 % m;
		
		System.out.println(m + "--" + m2 + "--" + result);
		
	}

}
