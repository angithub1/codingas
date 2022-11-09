import java.util.*;

  record Item(String name, String surname) {}

  class Shop {
	  public static Item[] getItems() {
		  return new Item[] {
			  new Item("arshad","shaikh"),
			  new Item("altaf","shaikh"),
			  new Item("anis" , "shaikh"),
			  new Item("ansar","karbhari"),
			  new Item("anvar","karbhari"),
			  new Item("ajaj","patel"),
			  new Item("aman","shaikh"), 
			  new Item("afroj","shaikh") 
			  }; 
              }
  }

