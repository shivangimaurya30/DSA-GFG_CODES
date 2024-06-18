import java.io.*;
import java.util.*;
public class Q8_PrimalityTest {
    public boolean isPrime(int N) {
      // YOU NEED TO WRITE THIS CODE CODE ONLY NOT DRIVER CODE
      if(N==1)
      return false;
      
      if(N==2 || N==3)
      return true;
      
      if(N%2==0 || N%3==0)
      return false;
      
      for(int i=5;i<=Math.sqrt(N);i=i+6){
          if(N%i==0 || N%(i+2)==0)
          return false;
      }
      return true;
      
    }
    //DRIVER CODES STARTS
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    Q8_PrimalityTest obj=new Q8_PrimalityTest ();
		    int N;
		    N=sc.nextInt();//input n
		    if(obj.isPrime(N))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
}
}
