package page5_array;

public class Test0501 {
	
	/*
	 * 数组：
	 * 		暂存数据用的，还能对数据进行操作
	 * 数组是有序的集合，数组中的每一个元素具有相同的数据类型，可以用一个统一的数组名和下标来唯一地确定数组中的元素，且下标是从0开始
	 * 
	 * 数组元素为：
	 * 		基本数据类型
	 * 		某一类的对象（引用类型）
	 * 
	 * 
	 */
	
	//一维数组的定义方式：
	//		type [] arrayName;
	//还可以这样定义：
	//		int[] intArray;
	//		Date[] dateArray;
	
	//	复合类型的数组：
	//		Date[] dateArray;
	//	声明了一个容纳复合数据类型Date的数组。
	//		与C、C++不同，Java在数组的定义中并不为数组元素分配内存
	//		因此[]中不用指出数组中元素的个数，即数组长度
	//		而且对于如上定义的一个数组是不能访问它的任何元素的。必须经过初始化后，才能应用数组的元素。

	public static void main(String[] args) {
		
	//静态初始化
		int [] array = {1,2,3,4,5,6}; //定义了一个int类型的数组，数组名是array，值分别是1 2 3 4 5 6，值之间用,隔开
		
		System.out.println(array); //[I@15db9742  是内存地址
		System.out.println(array.length); //数组的长度
		
		//使用下标来查看数组的元素
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[array.length - 1]); //最后一个值
		
		//下标不存在
		//		System.out.println(array[10]);  java.lang.ArrayIndexOutOfBoundsException错误
		
		
		char [] cha = {'O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'};
		
		for (int i = 0; i < cha.length; i++) {
			System.out.print(cha[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		
	//动态初始化
		
		/*
		 * 动态初始化：
		 * 使用运算符new为数组分配空间，对于简单类型的数组，其格式如下:
		 *  type arrayName[]=new type[arraySize];
		 * 	type[ ] arrayName=new type[arraySize];
		 * 对于复合类型的数组，需要经过两步空间分配。
		 * 首先：type arrayName[ ]=new type[arraySize]; 
		 * 然后：arrayName[0]=new type(paramList);
		 * 		...
		 *  	arrayName[arraySize-1]=new type(paramList);
		 */
		
		char [] cave = new char[25]; //在内存中开辟25个空间来存放char类型类型
		
		//往这里面放内容
		cave[0] = 'O';
		
		for (int i = 0; i < cave.length; i++) {
			cave[i] = 'O';
			System.out.print(cave[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
