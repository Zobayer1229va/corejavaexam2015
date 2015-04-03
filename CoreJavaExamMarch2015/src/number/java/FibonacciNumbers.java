package number.java;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		/* 
		 * Fibonacci numbers are 0,1,1,2,3,5,8,13,21
		 * Write java code to find fibonacci sequences up to 100 numbers. 
		 * 
		 */
		int prev = 0;
		int next = 1;
		System.out.println("The prime numbers 1 to 100:");

		for(int i=0; i<100; i++){
			System.out.println(prev);
			next = prev+next;
			prev = next-prev;
		}
		
	}
	}


