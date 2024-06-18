package problems;
import java.io.*;
import java.util.*;
import java.math.BigDecimal; 

public class Q7_DigitsinFactorial {
    //You need to write this code 
        public int digitsInFactorial(int N) {
            if (N < 0) {
                return 0; 
            }
            
            if (N <= 1) {
                return 1; 
            }
            
            double digit = 0;
            for (int i = 2; i <= N; i++) {
                digit += Math.log10(i);
            }
            
            return (int) Math.floor(digit) + 1;
        }
        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
    Q7_DigitsinFactorial obj=new Q7_DigitsinFactorial();
		    int N;
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method digitsInFactorial()
		   System.out.println(obj.digitsInFactorial(N));
		    
}
}

