class Assignment2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		Mathutil u;
		boolean result = false;
		result = u.isEven(n);
		if(result)
			System.out.printf("The number is even %n");
		else
			System.out.printf("The number is odd %n");

	}
}
