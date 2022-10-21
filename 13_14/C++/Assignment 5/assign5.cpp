#include<stdio.h>
#include "assign5.h"
int main()
{
	double principle;
	float period;
	printf("Enter the principle and period:\n");
	scanf("%lf %f ", &principle, &period);

	PersonalLoan a(principle, period);
	HomeLoan b(principle, period);

	printf("Total EMI on personal Loan is %lf\n", a.GetEMI());
	printf("Total EMI on Home Loan is %lf\n", b.GetEMI());

	printf("Total payable amount with tax on personal loan is %lf\n",a.GetTax() );
	printf("Total Payable amount with discount on Home Loan is %lf\n", b.GetDiscount());
}
