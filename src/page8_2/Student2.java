package page8_2;

//和Operation0801imforation搭配

public class Student2 {
	/*
	 * 1.创建一个 学生类 Student，属性：姓名，年龄，学号，手机号 
	 * 2.学生有一个自我介绍的方法showMe，(我的名字叫XX，我XX岁)
	 * 3.将班上比较熟的几位同学创建出来，分别调用他们各自的自我介绍的方 法
	 * 4.将这几位同学放进数组中，历打印出他们的学号和姓名
	 *  
	 */
	/*
	 * 私有化：
	 * private String phone;
	 * 
	 * private 修饰的属性是为了出于安全性的考虑
	 * 如果想要其他对象或类可以控制他们的访问权限，可以加上去
	 * 由于方法是共有的，所以可以提供一个公有的方法来访问私有变量
	 * 
	 */
	
	/*
	 * 快速构建get和set
	 * 		空白处-->右键-->source-->generated getter and setter
	 * 		选择你要让外部访问的属性
	 * 		-->点击
	 * 
	 * 
	 */
	
	public String name;
	public int age;
	public int sid;
	

	
	
	
	public Student2() {
		
	}




	public Student2(String name, int age, int sid, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.sid = sid;
		this.phone = phone;
	}




	public String showMe() {
		System.out.println("我的名字：" + this.name + ",我" + this.age + "岁");
		
		
		return "";
	}


	
	//访问私有变量
	private String phone;
	public String getPhone() {
		return this.phone;
	}
	
	//设置
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sid=" + sid + ", phone=" + phone + "]";
	}








	
	
	
	
	
	
	
	








}
