import java.util.*;
import java.util.Scanner.*;
class countdigit{
    static int countDigit(int n){
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
        System.out.println("Number of digits : "+countDigit(n));
    }
}
