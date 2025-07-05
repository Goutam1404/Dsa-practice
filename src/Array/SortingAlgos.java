package Array;

public class SortingAlgos {
	public static void printArr(int arr[]) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//taking the largest element to the last in each iteration O(n*n)
	public static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int swap=0;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap++;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("Loop is traversing till:"+(arr.length-1-i));
			System.out.println(i+":Number of swaps: "+swap);
			printArr(arr);
			System.out.println();
			if(swap==0) break;
		}
	}
	
	//Putting the smallest in the front O(n*n)
	public static void selectionSort(int arr[]) {
		 for(int i=0;i<arr.length-2;i++) {
			 int minPos=i;
			 for(int j=i+1;j<arr.length;j++) {
				 //finding the min positioh
				if(arr[minPos]>arr[j]) {
					minPos=j;
				}
			 }
			 //swap the current value in ith index with minPos index;
			 int temp=arr[minPos];
			 arr[minPos]=arr[i];
			 arr[i]=temp;
		 }
		 printArr(arr);
		
	}
	
	//Each element is checked with there previous element O(n*n)
	public static void insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int curr=arr[i];
			int prev=i-1;
			//finding out the correct position to insert
			while(prev>=0 && arr[prev]>curr) {
				arr[prev+1]=arr[prev];
				prev--;
			}
			//insertion
			arr[prev+1]=curr;
		}
		printArr(arr);
	}
	
	//Counting sort best case ~n How fast the Counting Sort algorithm runs depends on both the
	//range of possible values k and the number of values n
	//The frequency of elements is stored in a new array ,it is most suitable for an array consisting 
	//the least range of values
	public static void countingSort(int arr[]) {
		int n=arr.length;
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			largest=Math.max(largest, arr[i]);
		}
		int freqn[]=new int[largest+1];
		for(int i=0;i<n;i++) {
			int j=arr[i];
			freqn[j]++;
		}
		int i=0;
		for(int j=0;j<freqn.length;j++) {
			while(freqn[j]>0) {
				arr[i]=j;
				i++;
				freqn[j]--;	
			}
		}
		printArr(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[6];
		arr = new int[]{5,2,6,4,1,3};
//		bubbleSort(arr);
//		printArr(arr);
//		selectionSort(arr);
//		insertionSort(arr);
		countingSort(arr);
		
	}

}
