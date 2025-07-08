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
	
	public static void hcf(int a,int b) {
		int result=Math.min(a, b);
		while(result>0) {
			if(a%result==0 && b%result==0) {
				break;
			}
			result--;
		}
		System.out.println(result);
	}
	
	public static void lcm(int a,int b) {
		int result=Math.max(a, b);
		while(result<a*b) {
			if(result%a==0 && result%b==0) {
				break;
			}
			result++;
		}
		System.out.println(result);
	}
	
	public static void factorial(int n) {
		int ans=1;
		if(n>1) {
		for(int i=2;i<=n;i++) {
			ans*=i;
			}
		}
		System.out.println(ans);
	}
	
	//factorial using recursion
	public static int factorialRec(int n) {
		if(n==0) return 1;
		return n*factorialRec(n-1);
	}
	
	//A number whose factor's sum is equal to the number itself
	public static void perfectNumber(int n) {		
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.println((sum==n)?"Given number is perfect":"Given number is not perfect");
	}
	
	//0,1,1,2,3,5
	static void fibonacciSeries(int n) {
		int curr=0;
		if(n<=1) System.out.println(curr);
		int prev1=1;
		int prev2=0;
		System.out.print(prev2+" "+prev1);
		for(int i=2;i<=n;i++) {
			curr=prev1+prev2;
			prev2=prev1;
			prev1=curr;
			System.out.print(" "+curr);
		}
		System.out.println();
		System.out.println(curr);
	}

	//123=1*1*1+2*2*2+3*3*3
	static void armstrong(int n) {
		int num=n;
		int sum=0;
		int count=0;
		while(n>0) {
			int r=n%10;
			count++;
			n=n/10;
		}
		n=num;
		while(n>0) {
			int r=n%10;
			sum+=Math.pow(r, count);
			n=n/10;
		}
		System.out.println((sum==num)?"Number is armstrong":"Number is not an armstrong nu.");
	}

	//decimal to binary
	static void toBinary(int n) {
		StringBuilder binary=new StringBuilder();
		while(n>0) {
			int bit=n%2;
			binary.append(bit == 1 ? '1' : '0');
			n/=2;
		}
		binary.reverse();
		System.out.println(binary);
	}
	
	//12321-> reverse ->12321 
	static void palindrome(int n) {
		int rev=0;
		int num=n;
		while(n>0) {
			int r=n%10;
//			System.out.print(r);  //just printing the reverse number without storing it
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println((num==rev)?"Number is palindrome":"Number is not palindrome");
	}
	
	static int digitalRoot(int n) {
		if(n==0) return 0;
		if(n%9==0) return 9;
		return n%9;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		reverseNumber(241);
//		swapNumbers(5,4);
//		sumOfDigits(241);
//		hcf(20,28);
//		lcm(16,28);
//		factorial(5);
//		factorialRec(5);
//		perfectNumber(6);
//		fibonacciSeries(5);
//		armstrong(9474);
//		toBinary(12);
//		palindrome(12321);
		System.out.println(digitalRoot(1234));
	}
}
