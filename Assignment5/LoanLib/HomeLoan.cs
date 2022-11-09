namespace LoanLib;

public class HomeLoan : Loan, IDiscountable
{      
    
   public HomeLoan(double p, int n) : base(p, n) {}

 public override double Rate()
    {      
        if(Principle < 2000000)
         {
            return 0.1f;
         }

        else
            return 0.11f;

    }

     public double Discount()
     {  
        double disc=0;
        if(Principle > 100000)
        {
            disc = 0.05f;
        }
        else 
            disc = 0f;

        return Emi() * disc;
     }


}