// 输出 1000 - 2000 之间所有的闰年 
public class Test {
    public static void main(String[] args){
        int n;
        for(n=1000;n<2001;n++){
            if((n %400==0)||(n %4==0&&n %100!=0)){ //判断闰年条件：能被4整除且不能被100整除的
                System.out.printf("%d ",n );
            }
        }
    }
}