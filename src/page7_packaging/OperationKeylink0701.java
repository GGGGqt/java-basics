package page7_packaging;

public class OperationKeylink0701 {
	
	//第一题
	public void showLove(int num) {
		
		if (num > 0 && num <= 3000) {
					
			for (int j = 0; j < num; j++) {
				System.out.println("I love");
			}
					
		}else {
					
			System.out.println("输入有误");
		}
		
	}

	
	//第二题
	public void ps(String item) {
		System.out.println(item);
		
	}

	
	//第三题
	public void showIntArr(int [] arr) {
		
		System.out.println("arr中的值：");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	
	//第六题
	public void showCharArr2(char [][] chr) {
		for (int i = 0; i < chr.length; i++) {
			for (int j = 0; j < chr[i].length; j++) {
				System.out.print(chr[i][j]);
			}
			System.out.println();
		}
		
	}


	//第七题
	public int findMax(int [] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}


	public int[] addNum(int num, int []chr) {
		
		int [] newArr = new int[chr.length];
		for (int i = 0; i < chr.length; i++) {
			newArr[i] = chr[i];
		}
		newArr[newArr.length - 1] = num;
		
		return newArr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
