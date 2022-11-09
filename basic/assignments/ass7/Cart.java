class Cart {

	public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
	//int a, b , c;

 	Item i1 = new Item(a, b, c);
	//Item i1 = new Item(101, 18000, 5);
	//Item i2 = new Item(a, b, c);
	//Item i3 = new Item(a, b, c);

	System.out.printf("You purchased of  : %.2f%n",i1.getSellingPrice());
	System.out.printf("Number of items you purchased : %d%n",Item.getNoOfItems());

	System.out.println("========================================================");

        double d=0;
        PurchasedItem pi = new PurchasedItem(a, b, c, d);
        //PurchasedItem pi = new PurchasedItem(101, 18000, 5);
        System.out.printf("Total items in your cart : %d%n",PurchasedItem.getTotalItems());
	System.out.printf("Checkout amount after discount : %.2f%n",pi.getSellingPrice());

	

	}


}


