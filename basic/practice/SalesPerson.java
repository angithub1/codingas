

public class SalesPerson extends Employee {

	private double sales;

	public SalesPerson(int eid, int hrs, float rt, double sales) {
		super(eid, hrs, rt);
		this.sales=sales;
	}

	public double getSales() {
		return sales;
	}
	
	public double getIncome() {
		double salary = super.getIncome();
		double bonus = 0;
		if(sales > 20000) {
		       bonus = sales * 0.25;
		}
                  else
	              bonus = sales * 0.05;

		return salary + bonus;

    }


}

