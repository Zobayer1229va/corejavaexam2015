package month.java;

public class ApplyEnum {

	/**
	 * Please design the following Feature in java.
	 */
	public static void main(String[] args) {
		/*
		 * Create an Enum called Month,then create a class to use that Month Enum where you
		 * will implement a method using switch...case. Once the whole use able process is done,
		 * create an object in this main method to demonstrate the Enum feature in java.
		 */

		CreateEnum create = new CreateEnum(Month.October);
		System.out.println("Now the Month is: " + create.getMonth() + " ---");
		create.WhichMonth();

		System.out.println();
		
		create.setMonth(Month.December);
		System.out.println("Now the Month is: " + create.getMonth() + " ---");
		create.WhichMonth();
	}

	}


