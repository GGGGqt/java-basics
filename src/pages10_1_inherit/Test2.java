package pages10_1_inherit;

public class Test2 {
	
	public static void main(String[] args) {
		
		
		Animal animal = new Animal();
		animal.setName("动物");
		
		Animal an = new Cat();
		an.eat();
		
//		Cat cat = an;这样是不行的，因为an是Animal类的，是比较大的类
		//强制转换
		Cat cat = (Cat) an;//向下转型：父类转子类
		cat.eat();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
