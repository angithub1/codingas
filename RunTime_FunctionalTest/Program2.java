 class Program2 {


		 private static double safeScheme(int x) {
			 return x < 3 ? 5 : 10;
		 }
	 

		 public static void main(String[] args) {
                 var input = new java.util.Scanner(System.in);
		 System.out.println("Enter the amount and period");
		 double a = input.nextDouble();
		 int n = input.nextInt();
		 Investment i = new Investment(a,n);
		 System.out.printf("Your return amount is = %.2f%n", i.getFutureValue(Program2::safeScheme));
		 System.out.printf("Your return amount is = %.2f%n", i.getFutureValue(x -> 5 + 0.25 * x));

		 }
	 }
 
