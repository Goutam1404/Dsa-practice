package Pattern;

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
//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//5 5 5 5 5 
	public static void Pyramid() {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
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
	public static void Pyramid2() {
		for(int i=1;i<=5;i++) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		halfPyramid();
//		halfPyramidWithCh();
//		rectangle();
//		Pyramid();
		Pyramid2();
	}

}
