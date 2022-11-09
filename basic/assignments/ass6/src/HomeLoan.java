package banking;
public class HomeLoan extends Loan implements Discountable {

	//private double interest;
	
	public HomeLoan() {

          }

	public HomeLoan(double principle, int period) {
		super(principle, period);
		
		
		}
	

	public double getRate() {
		double interest = 0;
		double amount = getPrinciple();
		
		if(amount < 2000000) {
			interest = 0.1;
		}
		else 
			interest = 0.12;

		return interest;
	}

	public double getDiscount() {
		double am = 0;
		am = super.getEmi();
		
		return am * 0.05;
	}


	public double getNetEmi() {
		double net = 0;
	        net = super.getEmi();
		return (net - getDiscount());
	}





}






