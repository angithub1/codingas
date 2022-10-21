#include<stdio.h>
int main (void) 

{       float width=0;
	float length=0;
	int count=0;
	double amount=0;

	printf ("Enter the width and length of notebook \n");
        scanf ("%f %f" ,&width ,&length);
	printf ("Enter the number of notebook \n");
	scanf ("%d",&count);
	amount = 0.5 * width * length * count;
	printf ("The amount is : %lf", amount );
}


