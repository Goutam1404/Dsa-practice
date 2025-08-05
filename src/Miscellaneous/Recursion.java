package Miscellaneous;

public class Recursion {
		static int sum(int n){
	      System.out.println(n);
	      if(n<=0){
	        return 0;
	      }
	      // int ans=0;
	      // System.out.println(ans);
	      // ans=n+sum(n-1);
	      return n+sum(n-1);
	    }
	    
	    static String rev(String str){
	    // StringBuilder sb=new StringBuilder("");
	    // if(sb.length!=s.length()) return s;
	    // // sb.a
	    //   return rev(sb.toString());
	       System.out.println(str);
	      // if (str.isEmpty()) return str;
	      if(str.length()==1) return str;
	      //Here 1st we have to do recursive operation and then add the character
	          return rev(str.substring(1)) + str.charAt(0);
	    }
	    
	    static int sumArray(int[] arr, int n) {
	    // Base case
	    	if (n <= 0) {
	    		return 0;
	    	}
	    // Recursive case: sum of last element + sum of remaining
	    	return sumArray(arr, n - 1) + arr[n - 1];
	    }
	    
	    static int fact(int n) {
	    	if(n==0)return 1;
	    	return n*fact(n-1);
	    }
	       
	    //It will return the nth fibonacci series
	    static int fib(int n) {
	    	if(n==0 || n==1) return 1;
	    	return fib(n-1)+fib(n-2);
	    }

	    static Boolean isSorted(int arr[],int i){
	        if(i==arr.length-1) return true;
	        if(arr[i]>arr[i+1]){
	          return false;
	        }
	        return isSorted(arr,i+1);      
	      }
	    
	    //time complexity o(n)
	   static int pow(int x,int n) {
		  if(n==0) return 1;
//		   if(n==1 || n==0) {
//			   return x;
//		   }
		   return x*pow(x,n-1);
	   }
	    
	   //time complexity o(logn)
	  static int powOpti(int x,int n) {
		  if(n==0) {
			  return 1;
		  }
		  int halfPow=powOpti(x,n/2);
		  int halfPowSq=halfPow*halfPow;
		  if(n%2!=0) {
			  halfPowSq=x*halfPowSq;
		  }
		  return halfPowSq;
	  }
	  
	    public static void main(String[] args) {
	
		  // System.out.println(sum(5));
	      // String str="Hello"+"o";
	      
	      // System.out.println(str);
//	      System.out.println(rev("Hello"));
	      // int[] arr = {3, 5, 2, 8, 1};
	      //   int result = sumArray(arr, arr.length);
	      //   System.out.println("Sum of array elements: " + result);
//	      System.out.println(Math.pow(5,2));
//	      System.out.println(fact(5));
	    	System.out.println(pow(2,0));
	    	System.out.println(powOpti(2,2));
	}

}
