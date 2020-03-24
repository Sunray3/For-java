//完成猜数字游戏
import java.util.Random;
import java.util.Scanner;;
class Test {
 public static void main(String[] args) {
 Random random = new Random(); // 默认随机种子是系统时间
 Scanner sc = new Scanner(System.in);
 int toGuess = random.nextInt(100);
 // System.out.println("toGuess: " + toGuess);
 while (true) {
 System.out.println("请输入要输入的数字: (1-100)");
 int num = sc.nextInt();
 if (num < toGuess) {
 System.out.println("低了");
 } else if (num > toGuess) {
 System.out.println("高了");
 } else {
 System.out.println("猜对了");
 break;
 }
 }
 sc.close();
 }
}