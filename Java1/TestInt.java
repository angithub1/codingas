 public class TestInt{

	 public static void main(String[] args) {
		 int a = Integer.parseInt(args[0]);
		 var n1 = new MyInteger(a);
		
		if(n1.isNegative() == true) {
		 System.out.println("The number is negative");
		}
		if(n1.isPositive() == true) {
		 System.out.println("The number is Positive");
		}
		if(n1.isZero() == true) {
		 System.out.println("The number is zero");
		}
		if(n1.isOdd() == true) {
		 System.out.println("The number is odd");
		}
		if(n1.isEven() == true) {
		 System.out.println("The number is even");
		}



		// System.out.printf("The number is positive %d%n" , n1.isPositive());
		// System.out.printf("The number is zero %d%n" , n1.isZero());
		// System.out.printf("The number is odd %d%n" , n1.isOdd());
		// System.out.printf("The number is even %d%n" , n1.isEven());
	 }
 }

	  
