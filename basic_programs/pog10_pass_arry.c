#include<stdio.h>

     double GetAverage(int a[], int size)

       {
	       int i = 0;
	       double total = 0;

	       for(i=0; i<size; i++)
	         {
			 total = total + a[i];
		 }
                return total/size;
       }

     int main()
      {
	      int marks[] = {83, 90, 82, 83, 80};

	      double average = GetAverage(marks, 5);

	      printf("The average marks in ssc = %.2lf \n", average);

	      return 0;
      }
