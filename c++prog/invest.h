#include <cmath>

class Investment
{
  public :
     Investment ()

     {
	     amount = 10000;
	     period = 5;
     }

     Investment(double a, int p)
     {
	     amount = a;
	     period = p;
     }

     float InterestRate()
     { 
	     float rate = 0;
	     if (amount < 10000)
		     rate = 8.0;
	     if( (amount >= 10000) && (amount < 500000))
		     rate = 9.0;
	     if (amount > 50000)
		     rate = 10.0;
	     if (period > 5)
		     rate += 1;
	     return rate;
     }
     double GetInterest(int Interesttype)
     {
	     double interest = 0;
	     float rate = InterestRate();
	     if(Interesttype==1)
	     {
		     interest = (amount * period * rate)/100;
	     }
	     else
	     {
			     float s=pow(1 + (rate / 100), period);
		     interest = amount * s;
	     } 
	     return interest;
     }

		void    SetAmount(double amount)
	     {
		     this->amount=amount;

	     }
	    void  SetInterest(int period)
	     {
		     this->period=period;
	     }
  private : 
      double amount;
      int period;

};
