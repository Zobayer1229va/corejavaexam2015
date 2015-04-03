package number.java;

public class FindPrimeNumbers {

	/**
	 * Please do the flowing problem.
	 */
	public static void main(String[] args) {
	
		/* Find the prime numbers from 1 to 1000 then print to console.
	(prime numbers are only divisible by number 1 and the number itself.)
	(for example numbers like 2,3,5,7,9,11,13.....n are prime numbers. 
		*/
Boolean isPrime = true;
		
		int maxNumber = 1000;
		int temp = 0;
		int linkLoop = 0;
		
		System.out.println("The prime numbers 1 to 1000:");
		for ( int i = 2; i <= maxNumber; i++) {
			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				linkLoop++;
				if (i % j == 0){
					isPrime = false;
					break;
				}
			}
			if ( isPrime ) {
				System.out.format("%4d ", i);
				temp++;
				System.out.println();
			}
		}
		System.out.println(System.lineSeparator());
		System.out.println("There is " + temp + " prime numbers between 1 and " + maxNumber + ".");
		System.out.println("Total loop: " + linkLoop);

	}




	}


