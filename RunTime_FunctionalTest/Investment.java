 class Investment {

	private double amount;
        private int period;
        

        public Investment(double amt, int prd) {

	     amount = amt;
             period = prd;
	}

       public double getAmount() {
             return amount;
       }
 
       public int getPeriod() {
            return period;
       }

       public double getFutureValue(InterestRate Interest) {
	      double i = Interest.forPeriod(period)/100;
	      return (amount / i) * (Math.pow(1 + i, period) -1);
       }

 }

