package page8_1_object;

//构造方法一般都是用来实例化对象

//构造和创建函数不一样

public class Student {  //学生的实体类对象
	
	//对象具有的特征，也叫做对象的属性
	public String name;   //姓名
	public int num;		  //学号
	public char sex;	  //性别
	public int age;  	  //年龄
	
	//行为  做什么    也就是方法
	

	//空参的构造方法，就是构造student对象的方法，其实就是你在new
	//在new后就输出，不需要再手动输出
	public Student() {
		System.out.println("空参的构造方法");
	}
	
	//第一个类中没有void的，是构造方法，在new的时候调用了这个构造方法
	//加上void后，就被视为普通方法

	//有参构造
	//参数全写比较方便，因为不输入参数就默认为0
	public Student(int num,String name2) {
		this.name = name2;
		this.num = num;
	}
	
	//可以构造两个，但是在new后面使用时是看参数的数量来分辨用那个
	public Student(int num,String name2,int age, char sex) {
		this.name = name2;
		this.num = num;
	}
	
	
	//私有的方法
	public String showInfo() {
		
		String info = "";
		String name = this.name;		//this 就是当前类
		int age = this.age;
		info = name + "-----" +  age;				//字符串直接和数字
		System.out.println(info);
		return info;
	}
	
	

	
	
	
	
	//为了调试的时候比较方便查看对象，可以使用系统提供toString方法
	//右键> source > generate toString > 选择所有的属性 > 点击构建

	@Override
		public String toString() {
			return "Test0802Student [name=" + name + ", num=" + num + ", sex=" + sex + ", age=" + age + "]";
		}

	


	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

	
