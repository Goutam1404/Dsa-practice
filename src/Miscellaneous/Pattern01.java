package Miscellaneous;
import java.util.*;
public class Pattern01 {
//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4
	public static void halfPyramid() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}				
			System.out.println();
		}
	}

//    1
//   12
//  123
// 1234
//12345
	public static void InverseHalfPyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=0;k<n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}				
			System.out.println();
		}
	}
	
//	A 
//	B C 
//	D E F 
//	G H I J
	public static void halfPyramidWithCh() {
		char c='A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((c++)+" ");
			}				
			System.out.println();
		}
	}

//	* * * * * 
//	*       * 
//	*       * 
//	* * * * * 
	public static void rectangle() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				if(j==0 || i==0 || i==3 || j==4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void FloydTriangle(int n) {
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((num++)+" ");
			}				
			System.out.println();
		}
	}
	
//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//5 5 5 5 5 
	public static void Pyramid() {
		for(int i=1;i<=5;i++) {
			//for printing spaces
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			//for printing numbers
			for(int k=0;k<i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

//        1                
//      2 1 2 
//    3 2 1 2 3 
//  4 3 2 1 2 3 4 
//5 4 3 2 1 2 3 4 5 
	//if the space is removed
//      1
//     212
//    32123
//   4321234
//  543212345
// 65432123456
//7654321234567
	public static void Pyramid2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=2*(n-i);j++) {
//				for(int j=0;j<=(n-i);j++) {
				System.out.print(" ");
			}
			int num=i;
			while(num>0) {
				System.out.print(num+" ");
//				System.out.print(num);
				num--;
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k+" ");
//				System.out.print(k);
			}
			System.out.println();
		}
	}
	
//	 5 4 3 2 1 2 3 4 5 
//	   4 3 2 1 2 3 4 
//	     3 2 1 2 3 
//	       2 1 2 
//	         1 
	public static void ReversePyramid() {
		for(int i=5;i>=1;i--) {
			for(int j=0;j<=2*(5-i);j++) {
				System.out.print(" ");
			}
			int num=i;
			while(num>0) {
				System.out.print(num+" ");
				num--;
			}
			for(int k=2;k<i+1;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
//        1 
//      2 1 2 
//    3 2 1 2 3 
//  4 3 2 1 2 3 4 
//5 4 3 2 1 2 3 4 5 
//  4 3 2 1 2 3 4 
//    3 2 1 2 3 
//      2 1 2 
//        1 
	public static void diamond(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			int num=i;
			while(num>0) {
				System.out.print(num+" ");
				num--;
			}
			for(int k=2;k<i+1;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=0;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			int num=i;
			while(num>0) {
				System.out.print(num+" ");
				num--;
			}
			for(int k=2;k<i+1;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
//		halfPyramid();
//		InverseHalfPyramid(n);
//		halfPyramidWithCh();
//		rectangle();
		FloydTriangle(n);
//		Pyramid();
//		Pyramid2(n);
//		ReversePyramid();
//		diamond(n); //pyrmaid2 + reversePyramid
	}

}
