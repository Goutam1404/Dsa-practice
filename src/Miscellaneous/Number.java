package Miscellaneous;
import java.util.*;
public class Number {
	
	public static void reverseNumber(int n) {
		int rev=0;
		while(n>0) {
			int r=n%10;
//			System.out.print(r);  //just printing the reverse number without storing it
			rev=rev*10+r;
			n=n/10;
		}
//		System.out.println();
		System.out.println("Number after reverse is:"+rev);
	}
	
	public static void swapNumbers(int a,int b) {
		System.out.println("Before swap a="+a+" and b="+b);
//		a=a-b;//a=5 b=4 ,a=1
//		b=b+a;//b=5
//		a=b-a;
		//using xor operator
//		a=a^b;
//		b=b^a;
//		a=a^b;
		System.out.println("After swap a="+a+" and b="+b);
	}

	public static void sumOfDigits(int n) {
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println("Sum of digits for the given number is:"+sum);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		reverseNumber(241);
//		swapNumbers(5,4);
		sumOfDigits(241);
	}
}
