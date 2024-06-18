
import java.io.*;
import java.util.*;
public class Q9_exactly3divisors {
     public boolean isPrime(int N)
    {
        //WRITE ONLY THIS CODE 
        if(N<=1)
        return false;
        for(int i=2;i*i<=N;i++){
            if(N%i==0) 
            return false;
        }
        return true;
    }
    public int exactly3Divisors(int N){
        int count=0;
        for(int i=2;i*i<=N;i++){
            if(isPrime(i)){
                if(i*i <= N){
                    count++;
                }
            }
        }
        return count;
    }
    //DRIVER CODE ALREADY THERE IN SHELL!
    public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        Q9_exactly3divisors obj=new Q9_exactly3divisors();
		    int N;
		    N=sc.nextInt();//taking N
		    //calling function exactly3Divisors()
		    System.out.println(obj.exactly3Divisors(N));
		   
		    
		}
		
    }

