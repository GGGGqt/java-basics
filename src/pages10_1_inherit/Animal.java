package pages10_1_inherit;

public class Animal {
		
	//属性
	private String name;
	private int age;
	private int hp;
	private int sex;
	
	
	//构造方法
	
	public Animal() {
	
		System.out.println("这是Animal的无参构造");
	}


	public Animal(String name, int age, int hp, int sex) {
		super();
		this.name = name;
		this.age = age;
		this.hp = hp;
		this.sex = sex;
	}
	
	//成员方法
	public void eat() {
		
		System.out.println("动物吃的方法");
	}
	
	public void sleep() {
		
		System.out.println("动物睡觉的方法");
	}
	
	public void run() {
		
		System.out.println("动物跑的方法");
	}


	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getSex() {
		return sex;
	}


	public void setSex(int sex) {
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", hp=" + hp + ", sex=" + sex + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
