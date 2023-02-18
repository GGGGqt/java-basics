package page9;

public class Test0901 {
	
	public String name;
	public int age;
	public int sid;
	public String phone;
	

	
	/*
	 * 快速生成有参和无参构造
	 * 无参：
	 * 		空白处-->右键-->source-->generated constructor from superclass...-->点击generated
	 * 有参：
	 * 		空白处-->右键-->source-->generated constructor using fields
	 * 		选择要构建的参数，并勾选
	 * 		点击generated
	 * 
	 * 都去掉super
	 * 
	 * 
	 */
	
	public Test0901() {
		
	}



	public Test0901(String name, int age, int sid, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.sid = sid;
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "Test0901 [name=" + name + ", age=" + age + ", sid=" + sid + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
