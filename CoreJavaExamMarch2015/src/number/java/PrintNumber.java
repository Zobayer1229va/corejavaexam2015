package number.java;

public class PrintNumber {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
		
		/* use a for loop to print 1 to 100 and then store into an array.
		 *then use another for loop to print only odd numbers.Then add the 
		 *total numbers from the array.
		 */
		
int length = 100;
		
		int [] array = new int[length];
		
			System.out.println("First array:");
		for ( int i = 0; i < length; i++ ) {
			System.out.format( "%3d ", i + 1 );
			array[i] = i + 1;
			
							System.out.println();
		}
		System.out.println();
		
		int sum = 0;
		System.out.println("The odd elements in this array:");
		for ( int i = 0; i < length; i++ ) {
			
			sum += array[i];
			
				if ( array[i] % 2 != 0 )
				System.out.format("%3d ", array[i] );
			
			
				System.out.println();
		}
		System.out.println();
		
		System.out.println("Sum of full array is: " + sum + ".");
	}


		
	}


