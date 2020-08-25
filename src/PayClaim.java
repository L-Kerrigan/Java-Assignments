/* A pay claim object that uses the calculatePay method from the Payroll class to create a pay claim statement.
Assignment 4, Questions 3 & 4*/
public class PayClaim {
	private int noHoursWorked;
	private Payroll.PayLevel payLevel;
	private double calculatedPay;
	
	public PayClaim(int nHW, Payroll.PayLevel p) {
		if(nHW < 0 || nHW > 80) { //Employees can't work less than an hour or more than 80 hrs a week
			throw new IllegalArgumentException("Invalid hours worked.");
		}
		noHoursWorked = nHW;
		payLevel = p;
	}

	//Accessor methods for each variable
	private Payroll.PayLevel getPayLevel() {
		return payLevel;
	}

	private int getNoHoursWorked() {
		return noHoursWorked;
	}

	private double getCalculatedPay() {
		return calculatedPay;
	}

	//Mutator method for calculatedPay
	private void setCalculatedPay(double calculatedPay) {
		if(calculatedPay < 0) {
			throw new IllegalArgumentException("Pay can't be negative.");
		}
		this.calculatedPay = calculatedPay;
	}
	
	//Question 4
	private void calculatePay() {
		setCalculatedPay(Payroll.calculatePay(noHoursWorked, payLevel));
	}

	@Override
	public String toString() {
		if(calculatedPay == 0) { //If there's no pay, there's no point in printing it
			return "PayClaim for " + noHoursWorked + " hour" + (noHoursWorked == 1 ? "" : "s") + ", at PayLevel " + payLevel;
		} else {
			return "PayClaim for " + noHoursWorked + " hour" + (noHoursWorked == 1 ? "" : "s") + ", at PayLevel " + payLevel + ", which gives " + this.calculatedPay;
		}
	}


	public static void main(String[] args) {
		//Tests for the methods
		PayClaim pc = new PayClaim(1, Payroll.PayLevel.ONE);
		System.out.println(pc);
		
		PayClaim a = new PayClaim(10, Payroll.PayLevel.THREE);
		System.out.println(a);
		
		PayClaim s = new PayClaim(15, Payroll.PayLevel.TWO);
		System.out.println(s.getNoHoursWorked() + " " + s.getPayLevel());
		
		PayClaim d = new PayClaim(15, Payroll.PayLevel.TWO);
		d.setCalculatedPay(100);
		System.out.println(d);

		try {
			PayClaim f = new PayClaim(250, Payroll.PayLevel.ONE);
		} catch (IllegalArgumentException ex) {
			System.out.println("Failure - expected");
		}

		try {
			PayClaim g = new PayClaim(25, Payroll.PayLevel.ONE);
			g.setCalculatedPay(-1);
		} catch (IllegalArgumentException ex) {
			System.out.println("Failure - expected");
		}

		Payroll.OVERTIME_RATE = 2;
		Payroll.REGULAR_WEEK = 37;
		Payroll.LEVEL_ONE_PAY = 20;
		PayClaim p = new PayClaim(45, Payroll.PayLevel.ONE);
		p.calculatePay();
		System.out.println(p.getCalculatedPay());
		
		Payroll.OVERTIME_RATE = 2;
		Payroll.REGULAR_WEEK = 37;
		Payroll.LEVEL_ONE_PAY = 20;
		PayClaim q = new PayClaim(45, Payroll.PayLevel.ONE);
		q.calculatePay();
		System.out.println(q);
		
		Payroll.OVERTIME_RATE = 1.25;
		Payroll.REGULAR_WEEK = 55;
		Payroll.LEVEL_TWO_PAY = 40;
		PayClaim w = new PayClaim(70, Payroll.PayLevel.TWO);
		w.calculatePay();
		System.out.println(w.getCalculatedPay());
		
		Payroll.OVERTIME_RATE = 1.25;
		Payroll.REGULAR_WEEK = 55;
		Payroll.LEVEL_TWO_PAY = 40;
		PayClaim e = new PayClaim(70, Payroll.PayLevel.TWO);
		e.calculatePay();
		System.out.println(e);
	}
}