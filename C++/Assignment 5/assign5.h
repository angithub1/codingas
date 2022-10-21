class Loan
{
	protected:
	
		double principle;
		float period;
	public:
		Loan()
		{
	principle = 10000;
			period = 3;
		}

		Loan(double pr, float days)
		{
			principle = pr;
			period = days;
		}

		double GetPrinciple()
		{
			return principle;
		}

		float GetPeriod()
		{
			return period;
		}

		virtual float GetRate() = 0;

		double GetEMI()
		{
			double emi;
			float r;
			r = GetRate();
			emi = principle * (1 + r * period/100)/(12 * period);
			return emi;
		}
};
class Taxable
{
	public:

	virtual double GetTax()=0;
};
class Discountable
{
	public:
		virtual double GetDiscount()=0;
};
	


class PersonalLoan : public Loan , public Taxable
{
	public:
		PersonalLoan() : Loan()
		{
		}

		PersonalLoan(double pr,float days) : Loan(pr, days)
		{
		}
		
		float GetRate()
		{
			float rate;
			if(principle <= 500000)
				rate = 15;
			if(principle > 500000)
				rate = 16;
			return rate;
		}
		
		double GetTax()
		{
			double amt;
			amt  = GetEMI() * 1.18;
			return amt;

		}
};

class HomeLoan : public Loan,public Discountable
{
	private:
		double limit;	
	
	public:
	
		HomeLoan() : Loan()
		{
                }

		HomeLoan(double pr,float days, double lim = 2500000 ) : Loan(pr, days)
		{
			limit = lim;

		}

		float GetRate()
		{
			float rate;
			if(principle <= 2000000)
				rate = 10;
			if(principle >2000000)
			{
				if(principle < limit)
					rate = 11;
				else
					rate = 12;
			}
			return rate;
		}

		double GetDiscount()
		{
			double amt;
			amt = GetEMI() * 0.90;
			return amt;
		 
		}
};
/*
class Taxable
{
	public:
		virtual double GetTax() = 0;
};

class Discountable 
{
	public:
		virtual double GetDiscount() = 0;
};*/
