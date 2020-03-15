//编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 
//入，最多输入三次。三次均错，则提示退出程序 
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		 //初始化一个密码
        String my_password = new String("liuhanshishadiao");
        Scanner sc = new Scanner(System.in);
        //记录输入次数
        int count = 0;
        System.out.println("请输入密码: ");
        //从键盘上数入 3 次，进行比较
        for (count = 0; count < 3; count++) {
            String string = sc.nextLine();
            if (my_password.equals(string)) {
                System.out.println("登录成功！");
            } else if (!(my_password.equals(string)) && count <= 1) {
                System.out.println("密码错误，请重新输入！");
            } else if (!(my_password.equals(string)) && count == 2) {
                System.out.println("连续三次错误，程序退出！");
            }
        }
        sc.close();//调用关闭方法
    }
}