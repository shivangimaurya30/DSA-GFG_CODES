import java.util.*;
import java.util.Scanner.*;
class solution{
    static int countDigit(int n){
        //your code here!
        int i=0;
        while (n>0) {
            n=n/10;
            i++;
        }
        return i;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Number of digits : "+solution(n));
    }
}
