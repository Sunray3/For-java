//求两个正整数的最大公约数 
//如果两个数相等，则最大公约数为它本身
//两个数不等，则用两个数依次除 两个数中最小的一个到 1，直到找到同时能被两个数除尽的那个数
import java.util.Scanner; // 导入包
public class Test{
public static void  main(String[] args) {
	    System.out.println("输入两个数：");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m,n,t;
        if(a>b) {
            m = a;
            n = b;
        } else {
            m = b;
            n = a;
        }
        while(m%n != 0){
            t = m%n;
            m = n;
            n = t;   
			
        }
       System.out.println("最大公约数为："+n);
     }
} 
 
