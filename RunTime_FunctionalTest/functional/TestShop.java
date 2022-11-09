 import java.util.*;

 class TestShop {

	 public static void main(String[] args) {
		 if(args[0].equals("items")) {
			 var items = Shop.getItems();
			 Arrays.stream(items)
				 .filter(i -> i.surname().equalsIgnoreCase(args[1]))
				 .map(i -> i.name())
				 .forEach(System.out::println);
		 }
		 
		 else return;
	 }
 }

