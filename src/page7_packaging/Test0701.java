package page7_packaging;

public class Test0701 {
	/*
	 * 无参无返回值		public void sayHello(){		//打印}
	 * 无参有返回值		public String sayHello(){      //打印}
	 * 有参无返回值
	 * 有参有返回值
	 * 
	 * 修饰符     返回值     方法名（参数类型      参数变量名）{
	 * 			方法体
	 * }
	 * 修饰符：public 修饰的内容整个工程都能用，一般方法是public
	 * 返回值：可以是基础类型或复合数据类型，如果没有返回值用void表示
	 * 			如果有		方法体中结束的时候用return返回对于的内容
	 * 方法名：注意命名
	 * 参数：可以有或没有，如果有格式为
	 * 			参数类型 		参数变量名		int  a
	 * 
	 * 
	 */
	
//	无参无返回值
	public void sayHello() {
		System.out.println("World");
	}
	
//	无参有返回值		
	public String sayHello2() {
		return "world";     //只要返回的是String类型就可以了
	}
	
//	有参无返回值
	public void sayHello3(String name) {
		System.out.println(name + "say World");
	}
	
//	有参有返回值
	public String sayHello4(String name1) {
		return name1 + "say World";
	}
	
	
	
	
//格式：
	public static void main(String[] args) {
		gameHello();
		
	}	
		
		//使用main调用，main方法对应类里面的方法的时候只能调用有static修饰的方法
		//放在main{}外面
		public static void gameHello() {
			System.out.println("");
		}
//不建议这么用，因为static是静态的，会一直占用内存，如果循环内有很多语句，那就会占用很多内存
//会占用电脑资源
//除非项目要求必须这么做
		
//在同一个类里面调用方法
//gameHello()等同于    这个类     this.gameHello()
	
//可以跨类调用
//在另一个文件中要配合实例化
		/* 
		 * 若另一个class名为Test 
		 * 
		 * 先在本class中实例化
		 * Test test = new Test();
		 * 然后
		 * test.gameHello();
		 * 
		 * 
		 * 使用快捷键ctrl + 点击gameHello()  就可以跳转到
		 * public static void gameHello() {
		 * 		System.out.println("");
		 * }
		 * */

	
		
		
		/*在Test文件里是这样的
		 * 
		 * 因为文件中没有chr，使用在下一个文件中的chr，所以在()中添加char [][] chr
		 * public void game(char [][] chr) { 
		 * for (int j = 0; j < chr.length; j++) { 
		 * 		for(int j2 = 0; j2 < chr[j].length; j2++) { 
		 * 			System.out.print(chr[j][j2] + " ");
		 * 		}
		 * 		System.out.println(); } 
		 * }
		 */
		
		/*另一个文件
		 * char [][] chr = new char[5][5];
		 * 
		 * Test test = new Test();
		 * test.gameHello(chr);
		 * 
		 * 因为gameHello中没有chr，所以将chr作为参数传入
		 * 
		 */
		
		
		
		
		
		
		
	
}
