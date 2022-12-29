package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme"
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		
		 String test = "changeme";
		 
		 char[] charVal = test.toCharArray();
		 
		 System.out.println(charVal);
		 
		 for (int i = 0; i < charVal.length; i++) {
			 
			 if(i%2 != 0) {
					System.out.print(Character.toUpperCase(charVal[i]));
				}else {
					System.out.print(charVal[i]);
			
		}
		 }
	}
}
