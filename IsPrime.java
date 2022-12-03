package week1.assignments;

public class IsPrime {

	public static void main(String[] args) {
		int input = 7;
		int count = 0;

		for (int i = 1; i <= input; i++) {

			if(input % i == 0) {
				count = count+1;
			}

		}

		if(count == 2) {
			System.out.println("Given number is prime");
		}else {
			System.out.println("Given number is not prime");
		}
	}
}	



		
		


