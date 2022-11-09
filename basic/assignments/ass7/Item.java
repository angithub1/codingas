 public class Item {

	 private int id;
	 private int costPerUnit;
	 private int quantity;
	 
         public static int count = 0;

	 public Item() {
	 }

	 public Item(int cid, int cpu, int qty) {
		this.id = id;
	        costPerUnit  = cpu;
	        quantity = qty;
		count += quantity;
	 }

	 public static int getNoOfItems() {
		 return count;
	 }

         public int getId() {
		 return id;
	 }

	 public int getCostPerUnit() {
		 return costPerUnit;
	 }

	 public int getQuantity() {
		 return quantity;
	 }

	 public double getSellingPrice() {
		 return costPerUnit * quantity;
	 }
 }


