#include<stdio.h>

      int numbers [] = {5, 10, 15, 20, 25};

int main(void)

{
    int i=0;
    int sum = 0;
    float average=0;
    for (i = 0; i <=4; ++i)
    {
	    

     		if (numbers[i]%2==0)
     		{ 
	     		printf("The digits are even %d\n",numbers[i]);
     		}
     		else
    	        {
	    		 printf("The digits are odd %d\n",numbers[i]);
    	        }

	    sum = sum + numbers[i];
    }
     printf("The addition of numbers is = %d \n",sum);
     average = (sum)/5;
     printf("The average of numbers is = %.2f \n",average);
      
      
    /* if (numbers[i]%2==0)
     { 
	     printf("The digits are even %d\n",numbers);
     }
     else
     {
	     printf("The digits are odd %d\n",numbers);
     }*/
}
     

     



