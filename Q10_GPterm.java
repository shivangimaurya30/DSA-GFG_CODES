import java.io.*;
import java.util.*;
public class Q10_GPterm {    
    public double termOfGP(int A,int B,int N)
    {
        double r = (double) B / A;
        double term = A * Math.pow(r, N - 1);
        
        return term;
    }
    public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		    
        Q10_GPterm obj=new Q10_GPterm();
		    int A,B;
		    
		    //taking A and B
		    A=sc.nextInt();
		    B=sc.nextInt();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method termOfGP() of class GP
		   System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));
		    
		}
		
	}


