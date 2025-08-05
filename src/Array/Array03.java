package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Array03 {

	static void printArr(int arr[]) {
		for(int element: arr) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	static void rotateLeftByK(int arr[],int k) {
		int temp[]=new int[k];
		//storing the first kth elements
		for(int i=0;i<k;i++) {
			temp[i]=arr[i];  //{2,4,1},3,7,5,6 k=3   
		}
		//shifting the elements by kth place
		for(int j=k;j<arr.length;j++) {
			arr[j-k]=arr[j];
		}
		for(int i=k+1;i<arr.length;i++) {
			arr[i]=temp[i-k-1]; //0 i=4 k=3 i-k-1 0,
		}
		printArr(arr);
	}
	
	static void rotateRightByK(int arr[],int k) {
		  int n=arr.length;
		     k%=n;
		     int temp[]=new int[k];
				//storing the first kth elements
				for(int i=0;i<k;i++) {
					temp[i]=arr[n-k+i];  //2,4,1,3,{7,5,6} k=3 n=7  
				}
				//shifting the elements by kth place
				for(int j=n-1;j>=k;j--) {
					arr[j]=arr[j-k];
				}
//				for(int i=0;i<k;i++) {
//					arr[i]=temp[i]; 
//				}
				 for (int i = 0; i < k; i++) {
				        arr[i] = temp[i];
				    }
				printArr(arr);
	}
	
	//Optimised
	static void rightRotateOptimised(int arr[],int k) {
		int n=arr.length;
	     k%=n;
	     reverseArray(0,n-1,arr);
	     reverseArray(0,k-1,arr);
	     reverseArray(k,n-1,arr);
	     printArr(arr);
	}

	static void leftRotateOptimised(int arr[],int k) {
		int n=arr.length;
	     k%=n;
	     reverseArray(0,k-1,arr);
	     reverseArray(k,n-1,arr);
	     reverseArray(0,n-1,arr);
	     printArr(arr);
	}
	
	static void reverseArray(int left,int right,int arr[]) {
		while(left<right){
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
	}
	
	static void unionArray(int arr1[],int []arr2) {
		HashSet<Integer> set=new HashSet<>();
		int count=0;
		for(Integer i: arr1) {
			set.add(i);
		}
		for(int i: arr2) {
			set.add(i);
		}
		System.out.println("size of union is: "+set.size());
	}
	
	static void arrIntersection(int arr1[],int []arr2) {
		HashSet<Integer> set=new HashSet<>();
		int count=0;
		for(int i:arr1) {
			set.add(i);
		}
		for(int i:arr2) {
			if(set.contains(i)) {
				System.out.print(i+" ");
				set.remove(i);
				count++;
			}
		}
		System.out.println("size of intersection element: "+count);
	}
	
//	Given an integer array of size n, find all elements that appear more than n/3 times.
	 static List<Integer> majorityElement(int[] nums) {
	        List<Integer> arr=new ArrayList<>();
	        HashMap<Integer,Integer> map=new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);	
	        }
	        for(Integer k: map.keySet()) {
				if(map.get(k)>nums.length/3) {
					arr.add(k);
				}
			}
	        return arr;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,1,3,7,5,6};
		printArr(arr);
		int k=3;
//		rotateLeftByK(arr,k);
//		rotateRightByK(arr,k);
//		rightRotateOptimised(arr,k);
//		leftRotateOptimised(arr,k);
		unionArray(arr,new int[]{1,4,3,8,9});
		arrIntersection(arr,new int[]{1,4,3,8,9});
	}

}
