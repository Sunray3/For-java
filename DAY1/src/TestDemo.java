/**
 * Created with Interllij IDEA
 * Description:统计回文：“回文串”是一个正读和反读都一样的字符串，比如“level”
 * 输入描述:
 * 每组输入数据共两行。
 * 第一行为字符串A
 * 第二行为字符串B
 * 字符串长度均小于100且只包含小写字母
 * 输出描述:
 * 输出一个数字，表示把字符串B插入字符串A之后构成一个回文串的方法数
 * User:孙芮
 * Data:2020-03-04
 * Time:16:46
 */
import java.util.*;
public class TestDemo {
    public static boolean isHuiwen(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int count = 0;
        for(int i = 0; i <= str1.length();i++){
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i, str2);
            if(isHuiwen(sb.toString())){
                count++;
            }
        }
        System.out.println(count);
    }
}