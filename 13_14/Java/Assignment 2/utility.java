class MathUtil{
public static boolean isEven(int x){
if (x % 2==0)
	return true;
else 
	return false;
}
public static boolean isOdd(int x){
if (x % 2!=0)
	return true;
else
	return false;

}
public static boolean isPrime (int x){
	int i;
	int count=0;
	for(i=1;i<=x;++i)
	{
		if (x % i ==0)
			count= count + 1;

	}
	if (count == 2)
		return true;
	else 
		return false;


}
public static int isCountPrime(int low,int upp){
	int i;
	int count =0;
	for(i=low;i<=upp;++i)
	{  
		if(isPrime(i) == true)
			count = count + 1;
		


}
return count;
}
public static int reverse(int x)
{
	int rem,res=0;
	while(x!=0)
	{
		rem=x%10;
		res=res*10+rem;
		x=x/10;
	}
	return res;



}
public static int digitCount(int x)
{
	int i=1, count=0;
	while(i <= x)
	{
		i = i * 10;
		count = count + 1;
	}
	return count;
}
}
