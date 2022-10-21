#include<stdio.h>
double sum(float width, float height, float rate)
{	
      return sum = width * height * rate;
	
}
int main(void)
{       
	float  width=0;
	float  height=0;
	double sum;
	float  rate;
	printf("Enter the width and height of banner \n");
	scanf("%f %f",&width, &height);

	if(width > height)
	{
		printf("The price for your landscape banner is : %lf \n", sum(width, height, 0.85) );
	}
	else
	{
		printf("The price for your portrait banner is : %lf \n", sum(width, height, 0.75) );
	}
return 0;

}
