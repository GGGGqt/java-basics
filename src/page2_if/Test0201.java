package page2_if;

public class Test0201 {
	/*
	 * 比较运算符，结果只能是true和false
	 * | 或  两边有一个true结果就是true
	 * & 且  只有两边都是true结果才是true
	 * 
	 * 但实际使用中，一般使用 || 和  &&
	 * || 和   && 其用法和|、&是一样的，但前者效率更高
	 * 
	 * a < 0 | 0 > b | a < b    这个是从左往右依次比较
	 * a < 0 || 0 > b || a < b  这个是从左往右比较，但只要有一个满足，就不比较了
	 * 
	 * a < 0 & 0 > b & a < b    这个从左往右依次比较
	 * a < 0 && 0 > b && a < b  这个从左往右比较，一个不满足就不比较了
	 * 
	 * 拓展：数字的比较使用 ==
	 * 		字符串的比较使用equals
	 * 
	 * 		!=  不等于
	 * 
	 * ~或
	 * ^异或   两个相同为0，不同为1
	 */
	public static void main(String[] args) {
		
		int a = 10;
		int b = 13;
		String c = "hello";
		
		
		boolean res = a < b | a > b;
		System.out.println(res);
		
		boolean res2 = a < 0 & b < 0;
		System.out.println(res2);
		
		boolean res3 = a < 0 || 0 > b || a < b;
		System.out.println(res3);
		
		boolean res4 = c.equals("hello");           //字符串比较
		System.out.println(res4);
		
		boolean res5 = c== "hello";					//字符串比较
		System.out.println(res5);
		
		//数值之间比较就会进行二进制比较
		int res6 = (a ^ b);  			//1010        1101   进行二进制比较
		System.out.println(res6);
		
		int res7 = a & b;
		System.out.println(res7);
		
		
	}

}
