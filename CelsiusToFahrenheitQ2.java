import java.util.*;
import java.util.Scanner.*;
class CelsiusToFahrenheitQ2 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		    int C;
		    C=sc.nextInt();//input temperature in celscius
		    convert converter=new convert();
		    System.out.println((int)(converter.cToF(C)));//print the output
		}
		
	}
class convert
{
    public double cToF(int C)
    {
    
        return (C * 9.0 / 5.0) + 32;
    }
}
