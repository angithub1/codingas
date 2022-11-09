class TestEmp {
	public static void main(String[] args) {

		if(args.length > 0) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		float c = Float.parseFloat(args[2]);
                double d = Double.parseDouble(args[3]);
                
		Employee jack = new Employee(a, b, c);
		System.out.printf("Jack's salary is : %.2f%n", jack.getIncome());

		SalesPerson shane = new SalesPerson(a, b, c, d);
		System.out.printf("sk's salary is : %.2f%n", shane.getIncome());
		}
		else {
			Employee jill = new Employee(102, 150, 100);
		        System.out.printf("jill's salary is : %.2f%n", jill.getIncome());
			Employee john = new Employee(103, 100, 100);
		        System.out.printf("john's salary is : %.2f%n", john.getIncome());
			Employee jane = new Employee(104, 200, 100);
		        System.out.printf("jane's salary is : %.2f%n", jane.getIncome());

			SalesPerson sam = new SalesPerson(201, 150, 100, 25000);
		        System.out.printf("sam's salary is  : %.2f%n", sam.getIncome());
			SalesPerson sara = new SalesPerson(202, 180, 100, 30000);
		        System.out.printf("sara's salary is : %.2f%n", sara.getIncome());
			SalesPerson sk = new SalesPerson(203, 200, 100, 15000);
		        System.out.printf("sk's salary is   : %.2f%n", sk.getIncome());
		}
	
	}
}





		
