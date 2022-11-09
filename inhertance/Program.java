import payroll.Employee;
import payroll.Salesperson;

class Program {

	public static double getTax(Employee emp) {
		double i=0;
		double value = emp.getIncome();
			if (value > 15000) {
				i = value * 0.05;
			}
		return i;
	}

	public static void main (String[] args) {
		Employee A = new Employee();
		A.setHours(250);
		A.setRate(150);
		System.out.printf("Your salary is : %.2f%n",A.getIncome());
		System.out.printf("And your tax is : %.2f%n",getTax(A));

		Salesperson B = new Salesperson(250, 150, 25000);
		System.out.printf("SP salary is : %.2f%n",B.getIncome());
		System.out.printf("And your tax is : %.2f%n",getTax(B));
	}
	
}





