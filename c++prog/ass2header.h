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



  private : 
      double amount;
      int period;

};
