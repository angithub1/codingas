#include<stdio.h>
int main(void)
{	
	long long int number;
        register long long int a, b, c;
        printf("Enter the number : \n");
	scanf("%lld",&number);

         a=1;
	 b=number;
	 c=0;

	do 
        {
	a= a * 10;
	c= c + 1;
        }
        while (a <= b);

        printf("The digits are : %lld \n", c );

}
