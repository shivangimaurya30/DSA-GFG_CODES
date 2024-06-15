import java.io.*;
import java.util.*;
import java.util.Scanner;

class absolutevalueQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int I = sc.nextInt();
            value obj = new value();
            System.out.println(obj.absolute(I));
        }
    }

class value {
    public int absolute(int I) {
        if(I < 0)
            return -I;
        else
            return I;
    }
}
   
