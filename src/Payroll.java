/* This program contains a method to calculate one's pay given the rates below. These rates can change in the tests.
Assignment 4, Questions 1 & 2 */
public class Payroll {
	public static double OVERTIME_RATE = 1.5;
	public static int REGULAR_WEEK = 40;
	public static int LEVEL_ONE_PAY = 15;
	public static int LEVEL_TWO_PAY = 25;
	public static int LEVEL_THREE_PAY = 40;
	public enum PayLevel {ONE, TWO, THREE}

	public static double calculatePay(int noHoursWorked, PayLevel t) {

		if(noHoursWorked < 1 || noHoursWorked > 80) { //Employees can't work less than an hour or more than 80 hrs a week
			throw new IllegalArgumentException("Invalid number of hours worked.");
		} else {
			switch(t) {
			case ONE:
				if(noHoursWorked > REGULAR_WEEK) { //Figuring out overtime pay for pay level 1
					return (REGULAR_WEEK * LEVEL_ONE_PAY) + ((noHoursWorked - REGULAR_WEEK) * (LEVEL_ONE_PAY * OVERTIME_RATE));
				} else {
					return noHoursWorked * LEVEL_ONE_PAY;
				}
				case TWO:
				if(noHoursWorked > REGULAR_WEEK) { //Figuring out overtime pay for pay level 2
					return (REGULAR_WEEK * LEVEL_TWO_PAY) + ((noHoursWorked - REGULAR_WEEK) * (LEVEL_TWO_PAY * OVERTIME_RATE));
				} else {
					return noHoursWorked * LEVEL_TWO_PAY;
				}
				case THREE:
				if(noHoursWorked > REGULAR_WEEK) { //Figuring out overtime pay for pay level 3
					return  (REGULAR_WEEK * LEVEL_THREE_PAY) + ((noHoursWorked - REGULAR_WEEK) * (LEVEL_THREE_PAY * OVERTIME_RATE));
				} else {
					return noHoursWorked * LEVEL_THREE_PAY;
				}
				default:
					return 0;
			}
		}
	}
	
	public static void main(String[] args) {
		//Some tests to ensure the method works
		System.out.println(Payroll.OVERTIME_RATE);
		System.out.println(Payroll.REGULAR_WEEK);
		System.out.println(Payroll.LEVEL_ONE_PAY);
		System.out.println(Payroll.LEVEL_TWO_PAY);
		System.out.println(Payroll.LEVEL_THREE_PAY);
		System.out.println(Payroll.PayLevel.ONE);
		System.out.println(Payroll.PayLevel.TWO);
		System.out.println(Payroll.PayLevel.THREE);
		System.out.println();
		
		System.out.println(Payroll.calculatePay(1, Payroll.PayLevel.ONE));
		System.out.println(Payroll.calculatePay(10, Payroll.PayLevel.TWO));
		System.out.println(Payroll.calculatePay(20, Payroll.PayLevel.THREE));
		System.out.println(Payroll.calculatePay(70, Payroll.PayLevel.TWO));
		
		try {
			   System.out.println(Payroll.calculatePay(100, Payroll.PayLevel.TWO));
			} catch (IllegalArgumentException ex) {
			   System.out.println("failure");
			}
		
		Payroll.REGULAR_WEEK = 20;
		System.out.println(Payroll.calculatePay(25, Payroll.PayLevel.TWO));
		
		Payroll.OVERTIME_RATE = 2;
		Payroll.REGULAR_WEEK = 40;
		System.out.println(Payroll.calculatePay(35, Payroll.PayLevel.TWO));
		
		Payroll.OVERTIME_RATE = 1.75;
		Payroll.REGULAR_WEEK = 40;
		Payroll.LEVEL_ONE_PAY = 12;
		System.out.println(Payroll.calculatePay(35, Payroll.PayLevel.ONE));
		
		Payroll.OVERTIME_RATE = 1.75;
		Payroll.REGULAR_WEEK = 25;
		Payroll.LEVEL_TWO_PAY = 30;
		System.out.println(Payroll.calculatePay(35, Payroll.PayLevel.TWO));
		
		Payroll.OVERTIME_RATE = 1.75;
		Payroll.REGULAR_WEEK = 40;
		Payroll.LEVEL_THREE_PAY = 50;
		System.out.println(Payroll.calculatePay(10, Payroll.PayLevel.THREE));
	}

}
