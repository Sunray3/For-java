//打印 1 - 100 之间所有的素数 
import java.lang.Math;  //导入包
//
public class Test {
	public static  void main (String[]args){
		int n = 1; 
	    int i ;    // 用以遍历2到要判定的数之间所有可能整除n的值
 		double result; // 保存n的平方根
		while (n<100){  
			i = 2; //i 始于2
			n++;  // 向100靠近
			result = Math.sqrt(n); //计算且保存n的平方根
		while (i <= result){ // 当i<result
			if (n % i ==0){  //如果i可以整除n
				break;
			}
		else{
			i++; 
		}	
		}
		if (i > result){  //i 遍历完所有result
			System.out .println(n);
		}
		}
	}
}		
	
	
	
