package page8_1_object;

public class Test0801 {
	
	/*
	 * 面向对象 
	 * 英文oo 
	 * 在生活中所有的事务都可以用java的类来表示 
	 * 
	 * ·便于程序模拟现实世界中的实体 
	 * 		-用“类”表示实体的特征和行为 
	 * 隐藏细节
	 * 		-对象的行为和属性被封装在类中，外界通过调用 类的方法来获得，
	 * 		不需关注内部细节如何实现 
	 * ·可重用 
	 * 		-可以通过类的模板，创建多个类的对象
	 * 
	 * 创建对象的类和普通的没什么区别，一般叫 pojo 类或叫 bean
	 * 
	 */
	public static void main(String[] args) {
		
		Student student = new Student();
		

		
		student.name = "张三";
		student.age = 20;  //对象.属性 = 值		可以进行修改
		student.sex = '1';
		student.num = 10001;
		
		
		System.out.println(student.age);
		
//		System.out.println(student.toString());		//toString返回全部值，但不是在这个文件，是在link文件
		
		System.out.println(student);   // 未构建toString时返回page8.Test0802Student@15db9742
										
		//这个会时使其他参数为0
		Student student2 = new Student(10002,"李四");
		System.out.println(student2);
		
		
		
		String info = student2.showInfo();
		System.out.println(info);
		
		System.out.println();
		System.out.println("---------------------------------");
		
		
		//对象也是可以放到数组里面的，叫对象数组
//		int [] num2 = {1,20,3};
		
//		int [] num3 = new int[3];
		
		
		//对象数组也是这样new
		
		Student [] studentArr = new Student [2];
		
		studentArr[0] = student;
		studentArr[1] = student2;
//		studentArr[1] = new Student(20001, "班班");		//缩写的形式
		
		//对象数组的遍历
		for (int i = 0; i < studentArr.length; i++) {
			studentArr[i].showInfo();
		}
		
		System.out.println(studentArr[0]);
		
		
		
		
		
		
		
		
		
	}
}
