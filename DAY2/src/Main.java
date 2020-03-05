/**
 * Created with Interllij IDEA
 * Description:汽水瓶:3个空瓶子换一瓶饮料。如果给你10个空瓶，问你可以换多少饮料喝?
 * User:孙芮
 * Data:2020-03-05
 * Time:13:50
 */
import java.util.*;
public class Main {
    public static int drink(int n) {
        int total = 0;//饮料总数
//当大于两个空瓶的时候才可以换饮料
        while(n > 2) {
//n/3-->能够换来的饮料
            total = total+n/3;
//新的空瓶子个数--》n%3可能会不能整除
            n = n/3 + n%3;
        }
        //如果n==2，说明有两个空瓶可以喝商家借一瓶饮料
        if(n == 2) {
            total = total + 1;
        }
        return total;
    }
    public static void main(String[] args){
//创建键盘录入对象
        Scanner sc=new Scanner(System.in);
        int n;
        while(sc.hasNext())
        {
            n=sc.nextInt();
            System.out.println(drink(n));
        }
    }
}