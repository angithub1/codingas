 class Program {

	 public static void main(String[] args) {

		// double current = Double.parseDouble(args[0]);
		// double difference = Double.parseDouble(args[1]);
		// double ratio = Double.parseDouble(args[2]);
		 int n = Integer.parseInt(args[0]);

		 LinearSequence a = new LinearSequence();
		 PowerSequence b = new PowerSequence();

        	 System.out.printf("Sum of linear sequence is %.2f%n",a.sum(n));
		 System.out.printf("Sum of power sequence is %.2f%n",b.sum(n));

	 }
 }




		 
