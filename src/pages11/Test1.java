package pages11;

public class Test1 {
		//实现多态
	
		/*
		 * 第一种方法
		 * public class TestAnimal{
		 * 		public void test(Penguin t){ 
		 * 			t.eat()；
		 * 			t.sleep();
		 * 		}
		 * 		public void test(Mouse t){ 
		 * 			t.eat(); 
		 * 			t.sleep(); 
		 * 		}
		 * 		public static void main(Stringl args){
		 * 			TestAnimal hq = new TestAnimal ();
		 * 			hq.test(new Penguin("mick", 1));
		 * 			hq.test(new Mouse("jok", 2));
		 * 		}
		 * }
		 * 
		 */
	
			/*
			 * 现在，升级程序，增加一种新类型：Lion
			 * 		要求如下: 
			 * 			属性：姓名id 
			 * 		方法：
			 * 			吃饭、睡觉、自我介绍 
			 * 同时，实验室也负责对这类动物进行测试
			 * 
			 * 如果在第一种解决方案的基础上去解决，我们需要如下两个步骤： 
			 * 建立Lion类 修改TestAnimal类
			 * 增加方法： test(Lion t)
			 * 
			 * 
			 * 
			 * 但这样代码的可维护性低 
			 *
			 */
	
		/*
		 * 使用多态解决
		 * 
		 * 多态的实现之一：重写
		 * 多态的实现之二：接口				interface	一个对象可以实现多个接口
		 * 多态的实现之三：抽象类和抽象方法		abstract
		 * 
		 * 接口和继承可以一起使用，但继承只能一个，接口可以实现多个
		 */
	
		/*
		 * 多态：多种形态
		 * 	水：液态		气态		固态
		 * 	动物：狼w	老鼠m	蛇s
		 * 
		 * 前提：
		 * 		1.要有继承关系
		 * 		2.要有方法的重写
		 * 		3.父类引用指向子类（向上转型）
		 * 
		 * 三种动物都有出现方法，但是三个方法都不一样
		 * 这样的子类是独立的，不用的出现形式，这样的方法就是多表现
		 * 
		 * 多态上必须有方法的重写
		 * 		重写：
		 * 			就是两个类，父类和子类，子类的方法覆盖的父类的方法
		 * 			要求方法名和参数还有返回值要一模一样
		 * 
		 * 		重载：
		 * 			同一个类有两个或以上的方法，有相同的方法，但参数不同
		 * 			方法名相同，参数不同（构造就是典型的重载）
		 * 			
		 */
	
	
	
	public static void main(String[] args) {
		
		Animal an = new Cat();
		
		Cat cat = (Cat) an;
		an.eat();
		cat.eat();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
