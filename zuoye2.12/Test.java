// 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。 
public class Test {
    public static void main(String[] args) {
        
        int num = 23;
        int check = 0;
        odd(num);
        System.out.println();
        even(num);
    }
    public static void odd(int num) {
        for (int i = 30; i >= 0; i = i - 2) {//为奇数位
            if ((num & (1 << i)) != 0) {
                System.out.print("1 ");
            } else {
            System.out.print("0 ");
            }
        }
    }
    public static void even(int num) {
        for (int i = 31; i >= 0; i = i - 2) {//为偶数位
            if ((num & (1 << i)) != 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
