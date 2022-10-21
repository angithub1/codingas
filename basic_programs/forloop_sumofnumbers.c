#include<stdio.h>
int main(void)
{
	long long int upper, count, sum=0;

	printf("Enter the upper limit for addition : \n");
	scanf("%lld",&upper);
	for (count=1; count >= upper; count++)
	{
	       	sum = sum + count;

	printf("The addition of number is = %lld \n", sum);
	}
//	printf("The addition of number is = %lld \n", sum);
}
