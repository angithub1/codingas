package banking;
public class PersonalLoan extends Loan implements Taxable {

	private double rate;

	public PersonalLoan() {
		rate = 0.15;

	}

	public PersonalLoan(double principle, int period) {
		super(principle, period);
	}

	public double getRate() {
		double amount = getPrinciple();
		if(amount < 500000) {
			rate = 0.15;
		}
		else
			rate = 0.16;

		return rate;
	}


	public double getTax() {
		double emi = 0;
		emi = super.getEmi();
		return emi * 0.05;
	}

        public double getNetEmi() {
		double gnt =super.getEmi();
		return gnt + getTax();
	}


}
