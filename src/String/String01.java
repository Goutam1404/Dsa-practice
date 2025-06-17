package String;
import java.util.*;
public class String01 {
	
	//** isPalindrome
	//These program is for string with no space and no special characters
	public static boolean isPalindrome(String str) {
		int n=str.length();
		//racecar
		for(int i=0;i<n/2;i++) {
			if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(n-i-1))) {
                return false;
            }
		}
		return true;
	}

	//These program is for string with space and special characters
	  public static boolean isPalindromeSpecialCharacters(String s) {
	        int left = 0, right = s.length() - 1;
	        while (left < right) {
	            
	            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
	                left++;
	            }

	            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
	                right--;
	            }

	            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
	                return false;
	            }

	            left++;
	            right--;
	        }

	        return true;
	    }
	
	  //Anangram is the analogy for strings i.e it checks all the alphabates in both strings are equal or nor  
	  public static boolean isAnagram(String s, String t) {
	        s=s.toLowerCase();
	        t=t.toLowerCase();
	
	        s=s.replace(" ","");
	        t=t.replace(" ","");
	        int arr[]=new int[26];
	        for(int i=0;i<s.length();i++){
	            arr[s.charAt(i)-'a']++;
	        }
	        for(int i=0;i<t.length();i++){
	            arr[t.charAt(i)-'a']--;
	        }
	    for(int count: arr){
	        if(!(count==0)){
	            return false;
	        }
	    }
	    return true;
	    }
	  
	  //** Anagram using hashmap
	  public static boolean isAnagramHash(String s,String t) {
		  HashMap<Character,Integer> map=new HashMap<>();
		  for(char ch:s.toCharArray()) {
			  map.put(ch, map.getOrDefault(ch, 0)+1);
		  }
		  for(char ch:t.toCharArray()) {
			  if(map.get(ch)!=null) {
				  if(map.get(ch)==1) {
					  map.remove(ch);
				  }else {
					  map.put(ch, map.get(ch)-1);
				  }
			  } else {
				  return false;
				}
		  }
		  
		  return map.isEmpty();
	  }
	  
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="raceCar";
		String str2="A man, a plan, a canal: Panama";
		System.out.println(str1+" is a palindrome :"+isPalindrome(str1));
		System.out.println(str2+" is a palind	rome :"+isPalindromeSpecialCharacters(str2));
		String s1="car";
		String s2="rac";
		System.out.println(isAnagram(s1,s2));
		System.out.println(isAnagramHash(s1,s2));
	}

}
