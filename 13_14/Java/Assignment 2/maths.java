class Maths{
	public static void main(String[] args){
	int num =Integer.parseInt(args[0]);
	int lower =Integer.parseInt(args[1]);
	int upper = Integer.parseInt(args[2]);

	if(MathUtil.isEven(num) == true)
		System.out.println("Given number is even");
	else

		System.out.println("Given number is not even");

	if(MathUtil.isOdd(num) == true)
		
		System.out.println("Given number is odd");
	else

		System.out.println("Given number is not  odd");
	
	if(MathUtil.isPrime(num) == true)
	
		System.out.println("Given number is Prime");
	else

		System.out.println("Given number is not Prime");
	


	System.out.printf("Prime numbers between %d and %d are %d %n ",lower,upper,MathUtil.isCountPrime(lower,upper));

	System.out.printf("Reverse of %d is %d %n",num, MathUtil.reverse(num));

	System.out.printf("Number of digits in %d are= %d %n", num, MathUtil.digitCount(num));
	
		


}
}
