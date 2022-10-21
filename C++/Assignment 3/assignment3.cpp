#include<cstdio>
 class Patient
{
	private : 
		int id;
		int bedtype;
		int totaldays;

	public : 
		Patient()
         	{
			id = 101;
			bedtype = 1;
			totaldays = 100;
		}
		Patient(int pid, int type, int days)
		{
			id = pid;
			bedtype = type;
			totaldays = days;
		}


		int Getid()
                {
                   return id;
		}
		void Setid(int pid)
		{
			id = pid;
		}

		int Getbedtype()
                {
                   return bedtype;
		}
		void Setbedtype(int type)
		{
			bedtype = type;
		}

		int Gettotaldays()
                {
                   return totaldays;
		}
		void Settotaldays(int days)
		{
		       totaldays = days;
		}


		virtual double GetBillAmount() const
		{       
			int price = 0;

			if(bedtype==1)
			{
				price = 500;
			}
			
			if (bedtype==2)
			{
			        price = 350;
			}
			
		        if (bedtype==3)
			{
			        price = 200;
			}

		      double amount = totaldays * price;
		      return amount;
			
		}
};

 class InHousePatient : public Patient
{
	private : 
		float discount;

	public : 
		InHousePatient () : Patient ()
		{
			discount =0;
		}

		InHousePatient(int id, int bedtype, int totaldays, float disc) : Patient(id, bedtype, totaldays)
	{
		discount = disc;
	}

		float Getdiscount()
                {
                   return discount;
		}
		void Setdiscount(float disc)
		
		{
			discount = disc;
		}


		double GetBillAmount ()
		{
			double amount = Patient :: GetBillAmount();
			if (amount>10000)
			{
				return amount * 0.9;
			}
			else
			return amount;
		}

};

         double GetTax(const Patient& p)
           {
		   double tax;
		   double amount = p.GetBillAmount();
		   amount = amount * 0.05;
		   return amount;
	   }




 int main(void)

{
          int id, bedtype, totaldays;

	  printf("================================================\n");
	  printf("Hello, Please enter the patient details : ID/BedType/TotalDays  \n");
	  printf("================================================\n");
	  scanf("%d%d%d", &id, &bedtype, &totaldays);

	  Patient p(id, bedtype, totaldays);

	  printf("Your total bill is = %.2lf\n", p.GetBillAmount());
	  printf("The GST on your bill is = %.2lf \n",GetTax(p));

	  float discount;
	  InHousePatient hp(id, bedtype, totaldays, discount);

	  printf("Inhouse patient bill is = %.2lf\n", hp.GetBillAmount());
	  printf("And the GST on bill is = %.2lf \n", GetTax(hp));

	  printf("Good bye user \n");
	  printf("================================================\n");


}
