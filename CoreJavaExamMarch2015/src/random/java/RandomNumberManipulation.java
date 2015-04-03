package random.java;

public class RandomNumberManipulation {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
	  /*
	   * Declare an array to store 50 random numbers range from 1 to 500. Then find the 
	   * even numbers only to print to the console.
	   * Hints: use Random() class.
	   */

		int maxNumber = 50;
		int [] randomArray = new int[maxNumber];
		
		System.out.println("The random number's array: ");
		for ( int i = 0; i < maxNumber; i++ ) {
			randomArray[i] = (int) ( Math.random() * 500 + 1 );
			System.out.format(" %d", randomArray[i]);
			
			System.out.println();
		}
		System.out.println();
		
		int cntElem = 0;
		// print only even numbers in this array
		System.out.println("The even numbers in this array: ");
		for ( int i = 0; i < maxNumber; i++ ) {
			if ( randomArray[i] % 2 == 0 ) {
				System.out.format("%3d ", randomArray[i]);
				cntElem++;
			}
			
			// print 10 elements per line
			if ( cntElem == 10 ) {
				System.out.println();
				cntElem = 0;
			}
		}
	}

	}


