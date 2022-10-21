class Employee{

	public static void main(String[] args) {
		char n=0;
		int i = Integer.parseInt(args[1]);
		int h = Integer.parseInt(args[2]);
		double r = Double.parseDouble(args[3]); 
		Emp e = new Emp(n,i,h,r);
                System.out.printf("Hello Your salary is %.2f %n",e.getSalary());


	}
}
