//print the array
//reverse the array
//largest and second largest element of the array 
//smallest and second smallest element of the array
//printing the subarray
//finding the max sum of the subarray 
//kandane's algo
//Two sum

package Array;
import java.util.Arrays;

public class Array01 {
	//print the array
		public static void printArray(int arr[]) {
			for(int ele: arr) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
		
		//** reverse the array
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
		
		//** check whether the array is sorted or not
		//Ascending order
		public static boolean isSortedinIncr(int arr[]) {
			//1,2,3,4,4,5
			for(int i=1;i<arr.length;i++) {
				if(!(arr[i]>=arr[i-1])) {
					return false;
				}
			}
			return true;
		}
		//Descending order
		public static boolean isSortedinDecr(int arr[]) {
			//5,4,4,3,1
			for(int i=1;i<arr.length;i++) {
				if(!(arr[i]<=arr[i-1])) {
					return false;
				}
			}
			return true;
		}
		
		//**  largest and second largest value in the array	
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
			int max=arr[0];
			for(int i=1;i<arr.length-1;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
		}
		//second largest
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
		
		//** smallest value in the array
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
		// second smallest value
		public static int smallval2(int arr[]) {
			int secondSmallest=100; //some bigger value is to be assigned
			int smallest=arr[0];
			for(int i=1;i<arr.length-1;i++) {
				if(arr[i]<smallest) { 		 //4,1,3,2,5
					secondSmallest=smallest; //ss=4,3,2
					smallest=arr[i]; 		//s=1,1,1
				}
				else if(arr[i]>smallest && arr[i]<secondSmallest) {
					secondSmallest=arr[i];
				}
			}
			return secondSmallest;
		}
		
		//** subarrays
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
			int startIndex=0, endIndex = 0;
			 //1,3,-2,-4,5,6
			for(int i=0;i<arr.length;i++) {
					sum+=arr[i];//1,4,2,-2,5,11                                          
					if(sum<0) {
						startIndex=i+1; //j=0,0,0,4,4
						sum=0;
					}
					if(sum>max) {
						endIndex=i; //k=0,1,1,1,4,5
						max=sum; //max=1,4,4,4,5,11
					}	
				}
			System.out.println("By kadanes algo: "+max);
			//printing the subarray with max sum
			for(int i=startIndex;i<=endIndex;i++) System.out.print(arr[i]+" ");
		}
		
		//** two sum
		//*not optimised one (using Hashset)
		 public int[] twoSum(int[] arr, int target) {
		        int arr1[]=new int[2];
		        for(int i=0;i<arr.length-1;i++){
		            for(int j=i+1;j<arr.length;j++){
		                if(arr[i]+arr[j]==target){
		                arr1[0]=i;
		                arr1[1]=j;
		                }
		            }
		        }
		        return arr;
		    }
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
//		System.out.println("Elements of the array");
//		printArray(arr);
//		System.out.println(isSortedinIncr(arr));
//		reverseArray(arr);
//		printSubarray(arr);
//		System.out.println("1nd largest number: "+largestval1(arr));
//		System.out.println("2nd largest number: "+largestval2(arr));
//		System.out.println("1st smallest number: "+smallval1(arr));
//		System.out.println("2nd smallest number: "+smallval2(arr));
		int arr1[]= {1,3,-2,-4,5,6};
//		max_sumkadanes(arr1);
		System.out.println(-3*-4);
	}

}
