public class Test {
	public static void main(String [] args){
		int a = 10;
		int b = 20;
		int n = 0;
		//创建临时变量
		n = a ;
		a = b ;
		b = n;
		//使用加减运算
		b = a - b ;
		a = a - b ;
		b = a + b ;
		//最终得到的应是交换两次的结果
	System.out.println(a);
	System.out.println(b);
	}
}