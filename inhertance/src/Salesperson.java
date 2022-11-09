package payroll;

public class Salesperson extends Employee {

	private double sales;

	public Salesperson(int hrs, float rt, double sls) {
		super(hrs, rt);
		sales = sls;
	}

	public double getSales() {
		return sales;
	}

	public double getIncome() {
		double payment = super.getIncome();
		if(sales >= 10000)
			payment = payment + (sales * 0.1);
		return payment;
	}
}
