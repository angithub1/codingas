import utility.*;
public class TestNum{

	 public static void main(String[] args) {
		 int n = Integer.parseInt(args[0]);
		 var n2 = new MyNumber(n);
		
		if(n2.isNegative() == true) {
		 System.out.println("The number is negative");
		}
		if(n2.isPositive() == true) {
		 System.out.println("The number is Positive");
		}
		if(n2.isZero() == true) {
		 System.out.println("The number is zero");
		}
		if(n2.isOdd() == true) {
		 System.out.println("The number is odd");
		}
		if(n2.isEven() == true) {
		 System.out.println("The number is even");
		}


	 }
 }

	  
