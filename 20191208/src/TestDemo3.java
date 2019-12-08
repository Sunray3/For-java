import java.util.ArrayList;
import java.util.List;
//判断str2中是否包含str1中的字符
public class TestDemo3 {
    public  static List<Character> func(String str1, String str2){
        List<Character> ret = new ArrayList<>();
        for (int i = 0; i <str1.length() ; i++) {
           char ch  = str1.charAt(i);
            if(!str2.contains( ch+"")){
               ret.add(ch);
            }
        }
        return  ret;
    }
    public static void main(String[] args) {
  List<Character> list = func ("welcometoBit","come");
        System.out.println(list);
    }
}
