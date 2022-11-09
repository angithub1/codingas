 class TestEmp {

	 public static void main(String[] args) {
		 int eid = Integer.parseInt(args[0]);
		 int ag = Integer.parseInt(args[1]);
		 double hrs = Double.parseDouble(args[2]);
		 double rt = Double.parseDouble(args[3]);

		 //The arguments you are passing to object should be same as above you mentioned or declared 
		 //example eid, ag, hrs.

		 Employee e = new Employee(eid, ag, hrs, rt);

		 System.out.printf("Your total salary is = %.2f%n", e.getIncome());

	 }
 }


