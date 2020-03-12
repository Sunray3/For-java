//7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。 

public class Test {
	public static void main (String[] args){
		int n =1; //分母
		int m =1; // 因为加减所以第一次为一，第二次循环时为-1
		double sum=0.0;
		for(n=1;n <= 100; n++) { //分母从0-100
		sum +=1.0/(n*m);
        m=m*(-1); 		
		}
		System.out.println(sum);
	}
}