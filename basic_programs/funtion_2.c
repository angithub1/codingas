#include<stdio.h>




int main(void)

{       
		long long principle=0;
		double SI,CI;
		float rate=0;
                short int period=0;
		printf("Enter the principle, rate, period : \n");
		scanf("%lld %f %hd",&principle, &rate, &period );

		SI = (principle*rate*period)/100;
		CI = (principle/100);
	
		printf("The SI = %lf \n", SI);
		printf("The CI is = %lf \n", CI);

	return 0;
}

