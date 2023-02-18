package pages10_1_inherit;

public class Test {
	
	
	
	/*
	 * java.lang.Object是最大的类
	 * 在创建类时可以直接继承
	 * 在创建时有一个superclass，在里面输入要继承的类名
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Animal an = new Animal();
//		an.setHp(1000);
//		an.eat();
		
		System.out.println("------------cat-------------");
		/*
		 * 
		 *  构建子类对象的时候，父类的构建方法会被执行
		 * 如果子类也有父类的一样的方法，那就执行子类自己的方法
		 * 
		 */
		
		
		
		Cat cat = new Cat();
		//Cat未构建方法时cat.eat()返回Animal的eat()
		//但现在Cat构造方法了所以返回cat.eat()
		cat.eat();
		cat.setName("加菲");
		System.out.println(cat.getName());
		
		
		
		System.out.println("------------snake-------------");
		/*
		 * 
		 * 继承父类的同时，子类对象本身也可以拥有自己的属性和对象
		 * 
		 * 
		 * 
		 */
		
		Snake s = new Snake();
		s.eat();
		s.px();		//自己拥有的方法
		s.getSp();	//自己独有的属性
		s.setHp(500);
		System.out.println(s.getHp());
		
		
		/*
		 * 总结：
		 * 		如果父类有，子类没有，那么子类直接继承父类的属性
		 * 		如果自己有，就用自己的属性
		 * 方法：
		 * 		如果父类有方法，子类没有，就用父类的方法
		 * 		自己有，就用自己的方法
		 * 
		 * 方法的重写：
		 * 		子类和父类的方法有相同的名字，参数类型和个数还有返回值也相同
		 * 
		 * 重载？	
		 * ........
		 * 
		 */
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
