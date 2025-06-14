//print the array
//reverse the array
//largest and second largest element of the array 
//smallest and second smallest element of the array
//printing the subarray
//finding the max sum of the subarray
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
		
		//reverse the array
		//brute force approach will be creating an array in which will be taken 
		//from opposite indexes of original array
		//* optimised one
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
		
		// largest and second largest value in the array	
		//brute force
		public static int largestvalBysort(int arr[]) {
			Arrays.sort(arr);
			return arr[arr.length-1];
		}
		public static int secondLargestvalBysort(int arr[]) {
			Arrays.sort(arr);
			return arr[arr.length-2];
		}
		//* optimised one
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
		
		//smallest value in the array
		//its brute will be same like the largest only change will be we will access the 0th and 1th index
		//* optimised one
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
		
		//subarrays
		//printing the subarray and the sum of each subarray
		public static void printSubarray(int arr[]) {
			int sum;
			int max_sum=Integer.MIN_VALUE;
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i;j<arr.length;j++) {
					sum=0;
					for(int k=i;k<=j;k++) {
						sum+=arr[k];
						System.out.print(arr[k]+" ");
					}	
					System.out.print(" Sum ="+sum);
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//brute force approach for finding the maximum sum of the subarray
		public static void max_sum(int arr[]) {
			int max=Integer.MIN_VALUE;
				for(int i=0;i<arr.length;i++) {
				for(int j=i;j<arr.length;j++) {
					int sum=0;
					for(int k=i;k<=j;k++) {
						sum+=arr[k];
						if(sum>max) {
							max=sum;
						}
					}	
				}
			}
				System.out.println(max);
		}
		
		//optimised program for finding the maximum sum of the subarray
		//* kadane's algo
		public static void max_sumkadanes(int arr[]) {
			int max=Integer.MIN_VALUE;
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				
					sum+=arr[i];                                          
					if(sum<0) {
						sum=0;
					}
					if(sum>max) {
						max=sum;
					}	
				}
			System.out.println("By kadanes algo: "+max);
		}
		
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.println("Elements of the array");
		printArray(arr);
//		reverseArray(arr);
//		printSubarray(arr);
//		System.out.println("1nd largest number: "+largestval1(arr));
//		System.out.println("2nd largest number: "+largestval2(arr));
//		System.out.println("1st smallest number: "+smallval1(arr));
//		System.out.println("2nd smallest number: "+smallval2(arr));
	}

}
