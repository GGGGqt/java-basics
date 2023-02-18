package page5_array;

import java.util.Scanner;

public class Test0503 {
	public static void main(String[] args) {
		
		/*交换
		 * 
		 * int a = 10; int b = 13; int temp = 0;
		 * 
		 * temp = 10; a = b; b = temp;
		 */
		
		//数组的交换
		int [] arr = {12,13,9,2};
		int [] array = arr; //赋值给新的数组，其实就是把内存地址转移出去
		array[0] = 100;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		//两个数组是引用同一个数据地址，所以改变一个另一个也能改变
		System.out.println();
		
		
	//进行独立拷贝
		int [] arr2 = {12,13,9,2};  //旧数组
		int [] newArr = new int[arr.length + 1]; //新数组
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据：");
		
		int num = sc.nextInt();
		
		//把旧的数据加入新的数组中
		for(int i = 0; i < arr2.length;i++) { //遍历旧的数组
			newArr[i] = arr2[i];
		}
		
		//把输入的数据放入新的数组中
		newArr[newArr.length - 1] = num;

		 for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		
		//将新的数组赋值给旧的数组
		 arr2 = newArr;
		 
		 for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		 
 
		 
		sc.close();
		
		

	}
}
