#include<stdio.h>
int main(void)
{
	int first, second, add, subtract, multiply;
	float divide;
        printf("Enter two integers first and second \n");
	scanf("%d %d",&first, &second );
                  add = first + second;
        if (first > second)
        	{
	          subtract = first - second;
	        }
	else 
	        { subtract = second - first;
		}
                 multiply = first * second;
	if (first > second)
         	{
	          divide = first / second;
	        }
	else
        	{
	 	  divide = second / first;
        	}
	printf("The sum is = %d \n",add);
	printf("The substraction is = %d \n",subtract);
	printf("The multipication is = %d \n",multiply);
	printf("The division is = %.1lf \n",divide);
		
}

