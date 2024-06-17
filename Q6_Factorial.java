import java.io.*;
import java.util.*;
public class Q6_Factorial {
    public long factorial(int N) {
        // Your code here
        long T=1,i;
        for(i=2;i<=N;i++){
            T*=i;}
            return T;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    Q6_Factorial obj= new Q6_Factorial();
    System.out.println(obj.factorial(N));

}
}
