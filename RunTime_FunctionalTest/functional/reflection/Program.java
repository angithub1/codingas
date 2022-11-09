class Program {

	public static void printAsXml(Item info) {
		System.out.println("Item>");
		System.out.printf(" <name>%s</name>%n", info.name());
		System.out.printf(" <surname>%s<surname>%n", info.surname());
		System.out.println("</Item>");
		System.out.println();

	
	}


	public static void main(String[] args) {
		printAsXml(new Item("anis" , "shaikh"));
		printAsXml(new Item("ansar" , "karbhari"));
	}
}





