package month.java;

public class CreateEnum {
	public Month month;
	
	public CreateEnum(Month month){
		this.month = month;
	}
	
	public CreateEnum(){
	}

	public void setMonth(Month month) {
		this.month = month;
	}
	
	public Month getMonth() {
		return this.month;
	}

	public void WhichMonth(){
		switch(month) {
			case January: System.out.println("It is January.");
					break;
			case February: System.out.println("It is February, and it has 28 days.");
					break;
			case March: System.out.println("It is March, spring is near.");
					break;
			case April: System.out.println("It is April");
					break;
			case May: System.out.println("It is May.");
					break;
			case June: System.out.println("It is June.");
					break;
			case July: System.out.println("It is July..");
					break;
			case August: System.out.println("It is August.");
					break;
			case September: System.out.println("It is September, school begins.");
					break;
			case October: System.out.println("It is October.Happy birthday!");
					break;
			case November: System.out.println("It is November.");
					break;
			case December: System.out.println("It is December. ");
					break;
			default: System.out.println("No match.");
					break;
		}
	}


}
