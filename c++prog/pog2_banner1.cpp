#include "banner1.h"
#include<cstdio>
  
    double BannerPrice(Banner info, int copies)
{
	float rate = copies > 5 ? 0.80 : 0.75;
	return copies * rate * info.Area();
}

int main(void)
{
	Banner a;
	float x, y;
	printf("Enter the width and height of the banner \n");
	scanf("%f %f",&x, &y);
	int n;
	printf("Enter the no. of copies you want \n");
	scanf("%d",&n);

	a.Resize(x, y);
	printf("Total price of regular banner is = %.2lf \n", BannerPrice(a, n));
}
	
