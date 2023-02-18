package page8_2;

//和Student2搭配

public class Operation0801information {
	public static void main(String[] args) {
		
		/*
		 * 1.创建一个 学生类 Student，属性：姓名，年龄，学号，手机号 
		 * 2.学生有一个自我介绍的方法showMe，(我的名字叫XX，我XX岁)
		 * 3.将班上比较熟的几位同学创建出来，分别调用他们各自的自我介绍的方 法
		 * 4.将这几位同学放进数组中，历打印出他们的学号和姓名
		 *  
		 */
		
		
		Student2 student1 = new Student2();
		student1.name = "张三";
		student1.age = 20;
		student1.sid = 10001;
//		student1.phone = "18888888888";
		
		//访问私有变量
		student1.setPhone("18888888888");
		String phone = student1.getPhone();
		System.out.println(phone);
		
		
		System.out.println("student1:" + student1);
		
		System.out.println();
		System.out.println("-----------------------------------------");
		
		
		//有参构造创建对象
		Student2 student2 = new Student2("李四",30,10002,"");		//若有参构造个别参数没有值，那就可以用0		""		null
		//自我介绍的方法
		student1.showMe();
		student2.showMe();
		
		System.out.println();
		System.out.println("-----------------------------------------");
		
		
//		int [] arr = {1,2,3};
//		String [] strArr = {"1","2","3"};
		Student2 [] stuArr = {student1,student2};
		
		for (int i = 0; i < stuArr.length; i++) {
			System.out.print(stuArr[i].showMe());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
