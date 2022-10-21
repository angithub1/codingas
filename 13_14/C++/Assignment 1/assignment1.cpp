
#include <cstdio>
#include "invest.h"
int main(void)
{
    double amount;
    int period;
    int t;
    printf("Enter the amount and period \n");
    scanf("%lf %d", &amount, &period);
    Investment b(amount,period);
    printf("Enter the tyape of interest 1 for SI/ 2 for CI \n");
    scanf("%d",&t);
    printf("calculated intrest is: %lf",b.GetInterest(t));


    return 0;

}

