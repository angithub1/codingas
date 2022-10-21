#include "rupees.h"
#include<cstdio>
int main (void)
{
         int r, p;
	 printf("Enter the first currency details : \n");
	 scanf("%d %d",&r, &p);

	 Money a(r, p);
	 printf("Enter the second currency details : \n");
	 scanf("%d %d",&r, &p);

	 Money b(r, p);
	 Money c = a + b;
	 printf("Addition of amount =  \n");
	 c.Print();
	 Money d = a - b;
	 printf("Substraction of amount =  \n");
	 d.Print();
	 

}
