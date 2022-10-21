class Emp {
	private char name;
	private int number;
	private int hours;
	private double rate;

	public Emp(char n, int num, int hrs, double r) {
		name = n;
		number = num;
		hours = hrs;
		rate = r;
	}

	public double getSalary() {

		return hours * rate + getOverTime();
	}

	public double getOverTime() {
		double ot=0;

		if (hours > 150){
			ot = ((hours-150)*100);
		return ot;

		}
		
		else ot=0;
	
			return ot;
	}
		


}


