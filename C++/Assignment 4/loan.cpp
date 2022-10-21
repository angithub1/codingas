#include <cstdio>

class Loan
{
	public :
		Loan()
		{
			principle = 100000;
			period = 10;
		}


		Loan(double p, int n)
		{
			principle = p;
			period = n;
		}


		double Getprinciple()
		{
			return principle;
		}
		void Setprinciple(double p)
		{
			principle = p;
		}

		int Getperiod()
		{
			return period;
		}
                void Setperiod(int n)
		{
		  period = n;
		}


		virtual float GetInterestRate()=0;

		


	      double GetEMI()

	      {	
		    
	  	      float Interest;
		      double emi = (principle * (1 + GetInterestRate() * period/100)) / (12 * period);
			     return emi;
	      }
          

	private:
                double principle;
                int period;
};

   

class PersonalLoan : public Loan 
          {
		  private :
			 float Interest;

		  public : 

			 PersonalLoan() : Loan()
			 { 
				 Interest = 0.15;
			 }
		 PersonalLoan(double principle, int period, float r) : Loan(principle, period)
			 {
				 Interest = r;
			 }

		float Getrate()
		{
			return Interest;
		}
                void Setrate(float r)
		{
		  Interest = r;
		}

		float GetInterestRate()
		{
			float Interest = 0;
			double principle = Loan :: Getprinciple();

			if(principle <= 500000)
			{
			   Interest = 0.15;
			}
			else
			{
				Interest = 0.16;
			}
		return Interest;	

		}

/*	double GetEMI()
	 {	
	  	      
		      double emi = principle * (1 + Interest * period/100) / (12 * period);
			     return emi;
	 }*/
	




          };

  class HomeLoan : public Loan
    {

	    private :
		    float Interest;

	    public :

	    HomeLoan() : Loan()
	            {
			    Interest = 0.10;
	            }

		    HomeLoan(double principle, int period, float r) : Loan(principle, period)
	            {
			    Interest = r;
	            }

		float Getrate()
		{
			return Interest;
		}
                void Setrate(float r)
		{
		  Interest = r;
		}

		float GetInterestRate()
		{
			float Interest = 0;
			double principle = Loan :: Getprinciple();

			if(principle <= 2000000)
			{
			   Interest = 0.10;
			}
			else
			{
				Interest = 0.11;
			}
		return Interest;	

		}

/*		double GetEMI()

	      {	
	  	      
		      double emi = principle * (1 + rest * period/100) / (12 * period);
			     return emi;
	      }*/
    };

	 /*     double GetEMI()

	      {	
	  	      float Interest;
		      double emi = principle * (1 + Interest * period/100) / (12 * period);
			     return emi;
	      }*/
          


int main(void)

{
	double p;
        int n;
	float r;
      
//	printf("Enter the principle and period \n");
//	scanf("%lf %d",&p, &n);

        PersonalLoan pl(600000, 10, 0.1);
//	pl.Getprinciple();
//	pl.Setprinciple(p);
//	pl.Setperiod(n);

	
	printf("The monthly installment for your personal loan is : %.2lf \n", pl.GetEMI());

        HomeLoan hm(600000, 10, 0.1);
  //      hm.Setprinciple(p);
//	hm.Setperiod(n);

	printf("The monthly installment for your home loan is : %.2lf \n", hm.GetEMI());



}
	 



