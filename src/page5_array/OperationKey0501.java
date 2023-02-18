package page5_array;

public class OperationKey0501 {
	
	/*
	 * 1.数组的拷贝：创建一个int类型的一维数组srcArr，里面的数据有（12,34,123,124,55)，
	 * 将里面的每一个元素全部拷贝给目标数组destArr,然后将目标数组中的第一个元素和最后一个元素的值扩大10倍。
	 * 遍历打印数组destArr和遍历打印原数组srcArr。
	 */
	
	public static void main(String[] args) {
		
		//原来的数组
		int [] srcArr = {12,34,123,124,55};
		
		//新的数组，长度和原来一样
		int [] destArr = new int[srcArr.length];
		
		//把原来的数组每一个数值拷贝过去
		for (int i = 0; i < destArr.length; i++) {
			destArr[i] = srcArr[i];
		}
		
		destArr[0] = destArr[0] * 10;
		destArr[destArr.length - 1]*=10;  //等同于destArr[destArr.length - 1] = destArr[destArr.length - 1] * 10;
		
		//遍历打印两个数组
		for (int i = 0; i < srcArr.length; i++) {
			System.out.print("旧数组：" + srcArr[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		
		for (int i = 0; i < destArr.length; i++) {
			System.out.print("新数组：" + destArr[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
