package banking;
public abstract class Loan {

	private double principle;
	private int period;

	public Loan() {
	}

	public Loan(double p, int n) {
		principle = p;
		period = n;
	}

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double p) {
		principle = p;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int n) {
		period = n;
	}

	 public abstract double getRate();


	public double getEmi() {
		double emi = 0;
		return (principle * ( 1 + (getRate() * period / 100)/ (12 * period)));
	}
}

		


