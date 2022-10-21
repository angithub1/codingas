#include<stdio.h>

int main()

{
     int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     int count=0;
     int i=0;

     for (int i=1; i < 10; ++i)

     {
	     if(array[i] % 2 == 0)
	     {
		     count++;
		     return count;
	     }
	  
     }
     
     printf("The total even numbers are = %d \n", count);

}

