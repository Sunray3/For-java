//编写程序数一下 1到 100 的所有整数中出现多少个数字9。 

public class Test {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;//计数器
        for (n = 1; n <= 100; n++) {
            //判断个位上是否有 9 
            if (n % 10 == 9) {
                count++;
            } 
            //判断十位上是否有 9
            if (n / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
