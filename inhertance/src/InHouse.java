package billing;

  public class InHouse extends Patient {

	  private double discount;

	  public InHouse(int id, int type, int days, double disc) {
		  super(id, type, days);
		  discount = disc;
	  }

	  public double getDiscount() {
		  return discount;
	  }

	  public double getbillAmount(){

		  double amount = super.getbillAmount();
		  return amount * 0.9;
	  }
  }


