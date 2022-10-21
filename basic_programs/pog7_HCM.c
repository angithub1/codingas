#include<stdio.h>
int main()
{
	int num1, num2;
	int HCF;
	int count;
	printf("Enter any two integers to find HCF : \n");
        scanf("%d%d",&num1, &num2);
        
	for(count=1; count<=num2; ++count)
	{
		if (num1 % count == 0 && num2 % count ==0)
			HCF = count;
	}

	printf("The highest common factor is = %d \n", HCF);

	return 0;
}












        

