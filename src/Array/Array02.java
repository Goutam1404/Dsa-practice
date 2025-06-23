package Array;
import java.util.*;
public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,3,2};
		HashSet<Integer> hm=new HashSet<>();
		for(int i:arr) {
			hm.add(arr[i]);
		}
		System.out.println("Unique elements in the array are:"+hm.size());
	}

}
