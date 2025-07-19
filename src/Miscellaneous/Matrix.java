package Miscellaneous;

public class Matrix {

	static void printArr(int arr[][]) {
		int n=arr.length;
		System.out.println("Matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

//	static void addMatrix(int arr1[][],int arr2[][]) {
//		if(arr1.length!=arr2.length || arr1[0].length!=arr2[0].length) {
//			System.out.println("Multiplication can't be done:");
//			return;
//		}
//		for(int i=0;i<)
//	}
	
	static void multiplyMatrix(int arr1[][], int arr2[][]) {
		int row=arr1.length;
		int col=arr2[0].length;
		if(arr1[0].length!=arr2.length) {
			System.out.println("Multiplication can't be done:");
			return;
		}
		int newArr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<arr2.length;k++) {
					newArr[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		printArr(newArr);
		
	}
//	static void searchMatrix(int arr[][]) {
//		
//	}
	static void spiralMatrix(int arr[][]) {
		int startRow=0;
		int endRow=arr.length-1;
		int startCol=0;
		int endCol=arr[0].length-1;
		System.out.println("Spiral Matrix:");
		while(startRow<=endRow && startCol<=endCol) {
			//top
			for(int i=startCol;i<=endCol;i++) {
				 System.out.print(arr[startRow][i]+" ");
        
			}
			
            //right
			for(int i=startRow+1;i<=endRow;i++) {
                if(startRow==endRow){
                    break;
                }
				 System.out.print(arr[i][endCol]+" ");

			}
			
            //bottom
			for(int i=endCol-1;i>=startCol;i--) {
                if(startRow==endRow) break;
				 System.out.print(arr[endRow][i]+" ");
			}
			
            //left
			for(int i=endRow-1;i>=startRow+1;i--) {
                 if(startCol==endCol) break;
				 System.out.print(arr[i][startCol]+" ");
			}
			startCol++; //1
            startRow++; //1
            endRow--; //1
            endCol--; //2 1
		}
	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //3 X 4
		printArr(arr);
//		spiralMatrix(arr);
		int arr1[][]= {{2,3},{4,5}};
		int arr2[][]= {{1,2,3},{4,5,6}};
		
		multiplyMatrix(arr1,arr2);
	}

}
