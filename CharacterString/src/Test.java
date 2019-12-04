/*输入一个字符串，求出该字符串包含的字符集
输入：每组数据包含一个字符串， 字符串最大长度为100，且只包含字母，不可能为空串，区分大小写
输出：每组数据一行，按照原来的字符顺序输出字符集合，重复出现且靠后的字符不打印
*/
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Test {
//方法2 
    public static class Main{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("请输入一个字符串:");
            while(in.hasNext()){
                char[] c = in.next().toCharArray();
                StringBuffer sb = new StringBuffer();
                Set<Character> set = new HashSet<Character>();
                for(int i = 0;i<c.length;i++){
                    if(set.add(c[i]))//很巧妙
                        sb.append(c[i]);
                }
                System.out.println("输出结果为：");
                System.out.println(sb.toString());
            }
        }
    }


/*
//方法1 利用StringBuilder
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char temp = str.charAt(i);
                if (!builder.toString().contains(temp + "")) {
                    builder.append(temp);
                }
            }
            System.out.println("输出结果为：");
            System.out.println(builder.toString());

        }
    }

*/
}