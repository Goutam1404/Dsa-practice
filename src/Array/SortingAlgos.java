package Array;

public class SortingAlgos {
	public static void printArr(int arr[]) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//taking the largest element to the last in each iteration
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
	
	//Putting the smallest in the front
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[6];
		arr = new int[]{5,2,6,4,1,3};
//		bubbleSort(arr);
//		printArr(arr);
		selectionSort(arr);
	}

}
