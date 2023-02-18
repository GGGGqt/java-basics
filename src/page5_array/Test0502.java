package page5_array;

//因为下标的变化是有规律的，从0开始的，所以可以用for循环进行数组的遍历

public class Test0502 {
	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		
		//遍历数组
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println("------------------------------------------");
		//求和
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;   //sum += array[i]
		}
		System.out.println("和为：" + sum );
		
		System.out.println("------------------------------------------");
		
		//取最大值
		
		int [] array2 = {-10,-5,2,20,5,100,13,14,10};
		
		int max = array2[0]; //假设第一个值是最大的，然后逐一往后比
		
		for (int i = 1; i < array2.length; i++) {
			if (max < array2[i] ) {
				max = array2[i];
			}
		}
		System.out.println("最大值是：" + max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
