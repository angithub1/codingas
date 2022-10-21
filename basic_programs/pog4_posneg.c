#include<stdio.h>
int main()
{
	double num;
	printf("Enter the number what you want: ");
	scanf("%lf",&num);

	if (num <=0.0)
	{
		if (num==0.0)
			printf("You entered 0.");
		else
			printf("You entered the negative number.");
	}
	else 
	
			printf("You entered the positive number.");

	return 0;

}
