 //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，
 //其各位数字的立方和确好等于该数本身 ，如；153＝1＋5＋3?，则153是一个“水仙花数”。) 
 public class Test{
 public static void main(String[] args){
        int a; // 个位
        int b; // 十位
        int c; // 百位
        int s; // 各位数字的立方之和
        int count = 0; //统计水仙花数量
 
        for (int i = 0; i <= 999; i++) {
            a = i % 10;
            b= (i / 10) % 10;
            c = i/ 100;
            s = a * a * a + b * b* b + c * c * c;
            if (i == s) {
                count++;
                System.out.println("i = " + i);
            }
        }
        System.out.println("[0~999]的仙花数有 " + count+" 个");

    }
 
 }