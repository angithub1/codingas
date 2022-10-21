#include<stdio.h>
extern long GCD(long, long);

int main(void)
{
        long a, b, c, d;
	printf("Enter three positive integers \n");
	scanf("%ld %ld %ld",&a ,&b, &c );
	d = GCD (GCD (a, b), c);
	printf("The HCM is : %ld\n", d);
}
