package finance;

public class HomeLoan {

	 public float common(double amount, int period) {
		 return amount < 100000 ? 10 : 8;
	 }


	 //here in float rate amount we are calling above method common and passing those two parameters.
	 public float woman(double amount, int period) {
		 return common(amount, period) - 1;
	 }


	 public float soldier(double amount, int period) {
		 return 2;
	 }
 }

