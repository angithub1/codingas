#include<cstdio>
class Employee
{
   private :
	  int id;
	  int hrs;
	  float rate; 

   public : 
	  Employee ()
	  {
            id = 100;
	    hrs = 100;
	    rate = 200;
	  }

	  Employee (int id, int hrs, int rate)
	  {
	   this-> id = id;
	    this->hrs = hrs;
	   this-> rate = rate;
	  }

	  int Getid()
	  {
                  return id;
	  }
	  void Setid(int ii)
	  {
		  id = ii;
	  }

	  int Gethrs()
	  {
                  return hrs;
	  }
	  void Sethrs(int hh)
	  {
		  hrs = hh;
	  }

	  float Getrate()
	  {
                  return rate;
	  }
	  void Setrate(float rr)
	  {
		  rate = rr;
	  }

	 virtual double GetIncome() const
	 {
		 double income = 0;
		 income = hrs * rate;
		 if ((hrs - 180) > 0)
			 income = income + (hrs - 180) * 100;
		 return income;
	 }
};

class SalesPerson : public Employee
{     
	private : 
		double sales;

	public : 
                SalesPerson () : Employee ()
		{
			sales = 0;
		}

		SalesPerson(int id, int hrs, float rate, double sl) : Employee(id, hrs, rate)
		{

		}
                double Getsales()
       	        {
		    return sales;
	        }
		void Setsales(double sl)
		{
			sales = sl;
		}

		double GetIncome() const
		{
			double income = Employee:: GetIncome();
			income = income + 0.2 * sales;
			return income;
		}
};

      double GetTax(const Employee& e)
       {
	       double income = e.GetIncome();
	       double extra = income - 25000;
	       if (extra > 0)
		       return extra * 0.05;
	       else
		       return 0;
       }


int main (void)
{
	int id=0;
	int hrs=0;
	float rate=0;
	double sales=0;

        printf("Enter your details : Employee Number / Working Hours / Rate : \n");
	scanf("%d %d %f",&id ,&hrs, &rate);
	Employee e(id,hrs,rate);
	printf("Your salary is = %.2lf \n", e.GetIncome());
	printf("Your tax is = %.2lf \n", GetTax(e));
	printf("=========================\n");
	SalesPerson sp(id,hrs,rate,sales);
        printf("Enter your details : Employee Number / Working Hours / Rate / total sale : \n");
	scanf("%d %d %f %lf",&id ,&hrs, &rate, &sales);
	printf("SP salary is = %.2lf \n", sp.GetIncome());
	printf("Sp tax is = %.2lf \n", GetTax(sp));



}


