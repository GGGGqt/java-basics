package pages11;

public class Cat extends Animal {

	
	
	
	
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//cat继承抽象的Animal	默认重写对象的方法
	@Override
	public void eat() {
		System.out.println("猫吃鱼");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
