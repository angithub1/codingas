package payroll;

public class Employee{

	private int hours;
	private float rate;
	
	public Employee(int hrs, float rt) {
		hours = hrs;
		rate = rt;
	}

	public Employee() {
		this(150, 100);
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hrs) {
		hours = hrs;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rt) {
		rate = rt;
	}

	public double getIncome() {
		double payment = hours * rate;
		int ot = hours - 150;
		if(ot > 0)
		    payment = payment + (ot * 150);
		return payment;
	}
}



