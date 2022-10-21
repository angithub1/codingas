#include "banner2.h"
#include <cstdio>

double BannerPrice(Banner info, int copies)
{
	float rate = copies < 5 ? 0.80 : 0.75;
	return copies * rate * info.Area();
}
int main (void)
{
	Banner a;
	Banner b(Geometry::Elliptical);
	float x, y;
	printf("Enter banner diamensions \n");
	scanf("%f %f",&x, &y);
	int n;
	printf("Enter no. of copies \n");
	scanf("%d",&n);

	a.Resize(x, y);
	printf("Total price of regular banner = %.2lf \n", BannerPrice(a, n));
        b.Resize(x, y);
	printf("Total price of special banner = %.2lf \n", BannerPrice(b, n));
}
