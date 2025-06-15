package String;

public class String01 {
	
	//** isPalindrome
	//These program is for string with no space and no special characters
	public static boolean isPalindrome(String str) {
		int n=str.length();
		for(int i=0;i<n/2;i++) {
			if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(n-i-1))) {
                return false;
            }
		}
		//racecar
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="raceCar";
		String str2="A man, a plan, a canal: Panama";
		System.out.println(str1+" is a palindrome :"+isPalindrome(str1));
		System.out.println(str2+" is a palindrome :"+isPalindromeSpecialCharacters(str2));
	}

}
