// 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1 
import java.util.Scanner;
public class Test {
    //主方法
    public static void main(String[] args){
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您想要输入的值:");
        int num = in.nextInt();  //接收数据
        count = fun(num);  //调用找一个整数中二进制位为1的个数的方法
        System.out.println(num+"中有"+count+"个1.");
    }
    //找一个整数中二进制位为1的个数的方法
    public static int fun(int num){
        int count = 0;
        for (int i = num; i != 0; i >>= 1){  //若i不等于0,遍历其每一个二进制位
            if ((i & 1) == 1){
                count++;  //二进制位为1的个数加1
            }
        }
        return count;
    }
}


