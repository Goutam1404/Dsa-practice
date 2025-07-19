package Array;
import java.util.*;
//problems solved using hashset

public class Array02 {	
	static void countDuplicatesUsingSet(int arr[]) {
		HashSet<Integer> set=new HashSet<>();
		for(int i:arr) {
			set.add(i);
		}
		System.out.println(set.size());
	}
	
	static void removeDuplicatesUsingArr(int arr[]) {
		int j=0,count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				count++;
				arr[j+1]=arr[i];
				j++;
			}
		}
		for(int i=0;i<j+1;i++) System.out.print(arr[i]+" ");
		System.out.println(" Number of unique elements:"+count);
	}
	
	//finding the missing number between 0-arr.length in the array
	static void missingNumber(int []arr) {
		   int n=(arr.length*(arr.length+1))/2;
		    int sum=0;
		    for(int i:arr){
		        sum+=i;
		    }
		    System.out.println("Missing number in the array is: "+(n-sum));
	}

	//finding the missing number between 0-arr.length in the array using xor
	static void missingNumberXOR(int []arr) {
		int xor1=0,xor2=0;
		for(int i=0;i<arr.length;i++) {
			xor1=xor1^(i+1);
			xor2=xor2^arr[i];
		}
		System.out.println("Missing number in the array is: "+(xor1^xor2));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,4,5,3,2};
//		HashSet<Integer> hm=new HashSet<>();
//		for(int i:arr) {
//			hm.add(arr[i]);
//		}
//		System.out.println("Unique elements in the array are:"+hm.size());
		int sorted[]= {1,1,2,2,2,3,4,4,5,5,5};
//		countDuplicatesUsingSet(sorted);
//		removeDuplicatesUsingArr(sorted);
		missingNumber(new int[] {0,1,3,4});
		missingNumberXOR(new int[] {0,1,3,4});
	}

}
