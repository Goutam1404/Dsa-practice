package Array;
import java.util.*;
//problems solved using hashset
public class Array02 {
	
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
	
	static void countDuplicatesUsingSet(int arr[]) {
		HashSet<Integer> set=new HashSet<>();
		for(int i:arr) {
			set.add(i);
		}
		System.out.println(set.size());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,3,2};
		HashSet<Integer> hm=new HashSet<>();
		for(int i:arr) {
			hm.add(arr[i]);
		}
		System.out.println("Unique elements in the array are:"+hm.size());
		int sorted[]= {1,1,2,2,2,3,4,4,5,5,5};
		countDuplicatesUsingSet(sorted);
		removeDuplicatesUsingArr(sorted);
	}

}
