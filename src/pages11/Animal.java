package pages11;

public abstract class Animal {
	
	/*
	 * 把它改成抽象类
	 * 
	 * 	为什么：
	 * 		抽象的方法必须被重写
	 * 
	 * 
	 *  在class前面和方法名前面加    abstract
	 */
	

	//属性
		private String name;
		private int age;
		private int hp;
		private int sex;
		
		
		//抽象的方法 需要子类具体的去实现
				public abstract void eat();
				
				public abstract void sleep();
				
				public abstract void run();
		
		
		
		
		
		
				
				
		
		
		
		
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
