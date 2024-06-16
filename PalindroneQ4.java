
import java.io.*;
import java.util.Scanner;
public class PalindroneQ4 {

static boolean checkPalindrome(int n)
{
	int reverse = 0;
	int temp = n;
	while (temp != 0) {
	reverse = (reverse * 10) + (temp % 10);
	temp = temp / 10;
	}
	return (reverse == n); 
}
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    	int n = sc.nextInt();
	if (checkPalindrome(n) == true) {
	System.out.println("Yes, its a palindrone number!");
	}
	else {
	System.out.println("No, its not a palindrone number");
	}
}
}