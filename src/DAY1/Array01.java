package DAY1;

import java.util.Arrays;

public class Array01 {
	//print the array
		public static void printArray(int arr[]) {
			for(int ele: arr) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
		
		//finding the largest value in the 
	 	public static int largestval1(int arr[]) {
			int max=Integer.MIN_VALUE;
			for(int i=1;i<arr.length-1;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
		}
		public static int largestval2(int arr[]) {

			int sl=-1;
			int l=arr[0];	
			for(int i=1;i<arr.length-1;i++) {
				if( arr[i]>l) {
					sl=l;
					l=arr[i];
				}
				else if(l>arr[i] && arr[i]>sl) {
					sl=arr[i];
				}
			}
			return sl;
		}
		
		//finding the smallest value in the array
		public static int smallval1(int arr[]) {
			int min=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			return min;
		}
		public static int smallval2(int arr[]) {
			int ss=100;
			int s=arr[0];
			for(int i=1;i<arr.length-1;i++) {
				if(arr[i]<s) {
					ss=s;
					s=arr[i];
				}
				else if(arr[i]>s && arr[i]<ss) {
					ss=arr[i];
				}
			}
			return ss;
		}
		
		
		//reverse the array
		public static void reverseArray(int arr[]) {
			int n=arr.length;
			int left=0, right=n-1;
			while(left<right){
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
			printArray(arr);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.println("Elements of the array");
		Arrays.sort(arr);
		printArray(arr);
		reverseArray(arr);
		
//		removingDuplicate(arr);
		
//		System.out.println("1nd largest number: "+largestval1(arr));
//		System.out.println("2nd largest number: "+largestval2(arr));
//		System.out.println("1st smallest number: "+smallval1(arr));
//		System.out.println("2nd smallest number: "+smallval2(arr));
	}

}
