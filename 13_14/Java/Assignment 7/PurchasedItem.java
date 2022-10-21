public class PurchasedItem extends Item {

	private double discount;

	public static int total;

	public PurchasedItem() {
		discount = 0.05;
	}

	public PurchasedItem(int id, int costPerUnit, int quantity, double disc) {
		super(id, costPerUnit, quantity);
		discount = disc;
		total += quantity;

	}

	public static int getTotalItems() {
		return total;
	}

	public double getDiscount() {
		return discount;
	}

	public double getSellingPrice () {
	
		double sp = super.getSellingPrice();
		if(sp > 50000) {
			discount = 0.1f;
		}
		if(sp > 100000) {
			discount = 0.2f;
		}

		return sp - sp * discount;
	}
}


