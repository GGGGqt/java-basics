package page2_if;

public class Test0203 {
	public static void main(String[] args) {
		/*
		 * 多分支语句switch
		 * 
		 * switch(expression)         //expression表示要比较的内容
		 * {
		 * 		case value1:          //第一个判断expression和value是否相同
		 * 		{                     //相同执行且跳出这个判断，执行switch判断后面的代码
		 * 			statements1;
		 * 			break;
		 * 		}
		 * 		……
		 * 		case valueN:
		 * 		{
		 * 			statementN;
		 * 			break;
		 * 		}
		 * 		default:              //默认值，去过上面的case都没有匹配的值
		 * 		{
		 * 			defaultStatements;
		 * 		}
		 * }
		 * 
		 * 
		 */
		
		int a = 100;
		int b =20;
		int c;
		char oper = '+';
		
		switch(oper)
		{
			case '+':
			{
				c = a + b;
				System.out.println(c);
				break;
			}
			case '-':
			{
				c = a - b;
				System.out.println(c);
				break;
			}
			default:
			{
				c = a * b;
				System.out.println(c);
				break;
			}
		}
		
		String sex = "女0";
		switch(sex) {
		case "男":
			System.out.println("请进入男嘉宾区...");
			break;
		case "女":
			System.out.println("请进入女嘉宾区...");
			break;
		default:
			System.out.println("难道你去过泰国？？？");
			break;
		}
		
		/*
		 * if和switch都能进行判断
		 * 实际使用中：
		 * 		if可以使用区间判断  和单个值的判断
		 * 		switch 一般都对单个值判断时使用的比较多
		 * 
		 */
		
	}
}
