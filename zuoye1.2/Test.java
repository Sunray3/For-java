

public class Test {
	public static  void main (String[] args){
	   //if语句
	    int a = 10;
        int b = 30;
        int c = 20;
        int num = 0;
        if (a < b) {
            num = b;
            b = a;
            a = num;
        }
        if (a < c) {
            num = c;
            c = a;
            a = num;
        }
        if (b < c) {
            num = c;
            c = b;
            b = num;
        }
	    //利用三目运算符 
	    /* 
	    int   a = 10;
        int   b = 30;
        int   c = 20;
        int   max = (a >= b) ? a : b;
        max = (max >= c) ? max : c;
        int   min = (a <= b) ? a : b;
        min = (min <= c) ? min : c;
		
        System.out.println("max is : " + max);
        System.out.println("min is : " + min);
		*/
	   
	    System.out.println("max is : " + a );
		System.out.println("min is : " + c );
	}  
}	   
	  
		
	
