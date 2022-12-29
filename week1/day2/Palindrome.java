package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
	
		
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		
		String name = "madam";
		String reverseString = "";
		char[] inputCharArray = name.toCharArray();
		
		for(int i=inputCharArray.length-1; i>=0; i--) {
			reverseString= reverseString+ inputCharArray[i];
		
		}
		System.out.println(reverseString);
		
		// Both the initial and reverse are same
		//if(name.equals(reverseString)){
		
		if(name.equalsIgnoreCase(reverseString)) { // comparing the memory address
			System.out.println("They are palindrome");
		} else {
			System.out.println("They are not palindrome");
		}
			
		}

	}


