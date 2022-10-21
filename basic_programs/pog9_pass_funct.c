#include<stdio.h>

     double GetInterest (double p, float r, int n)
        { 
	     double Interest = 0;
	     Interest = (p * r * n)/100;

	     return Interest;
        }

     int main()
        {
	     double principle = 10000;
	     float rate = 1.8;
	     int period = 10;

	     double Interest = 0;
	     
	     Interest = GetInterest(principle, rate, period);
	     printf("Calculated interest is = %.2lf \n", Interest);

	     return 0;
	}







   
	
