//输出一个整数的每一位
public class Test  {
    public static void main(String[] args) {
        int num = 123;
        Print(num);
    }
    public static void Print(int num) {
        //递归终止条件
        if (num > 9) {
            Print(num / 10);
        }
        System.out.print(num % 10 + " ");     
    }
}