#include <cstdio>
class Money
{

 public :

	 Money (int rup, int pai)
	 {
		 rupees = rup + pai / 100;
		 paise = pai % 100;
               
		 puts("Initialized");
              
	 }

	//copy constructor 
	 Money(const Money& source)
	  {
		  rupees = source.rupees;
                  paise = source.paise;
                  #ifdef TESTING
	          puts("Copy constructor initialized");
                  #endif
	  }

	 int Amount() const
	 {
		 return 100 * rupees + paise;
	 }


	 void Print() const
	 {
		 printf("%d:%02d \n", rupees, paise);
	 }


	 //overloading addition(+) operator
	 Money operator+(const Money& rhs) const
	 {
	   return Money(rupees + rhs.rupees, paise + rhs.paise);
         }
	 Money operator-(const Money& rhs) const
	 {
	   return Money(rupees - rhs.rupees, paise - rhs.paise);
         }

	 
	 ~Money()
	   {
	      puts("Finalized");
	   }

 private :
          int rupees;
	  int paise;

};
