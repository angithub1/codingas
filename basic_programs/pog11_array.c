#include<stdio.h>
     
   double GetSalary(float h, float r)
      {

	      double result = h * r;
	      return result;
      }
 
   int main()
     {
	     float hours = 150;
	     float rate = 75;

	     double salary = GetSalary(hours, rate);

	     printf("Your salary is : %.2lf \n", salary);

	     return 0;
     }

