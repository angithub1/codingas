#include "poly_banner.h"
#include<cstdio>
 double BannerPrice(const Banner& info, int copies)
{
	float rate = copies < 5 ? 0.80 : 0.75;
	return rate * copies * info.Area();
}
int main(void)
{
  float x, y;
  printf("Enter the width and height \n");
  scanf("%f %f",&x, &y);
  int n;
  printf("Enter the no. of copies \n");
  scanf("%d", &n);

  Banner a;
  a.Resize(x, y);
  printf("Total price of regular banner = %.2lf \n", BannerPrice (a,n));

  CurvedBanner b;
  b.Resize(x, y);
  printf("Total price of curved banner = %.2lf \n", BannerPrice (b,n));
}


		 
