namespace LoanLib;

 public abstract class Loan
{
   private double principle;
   private int period;

   public Loan(double p, int n)
   {
      principle = p;
      period = n;
   }

    public double Principle
    {
        get {return principle;}

        set { principle = value; }
   }
      
    public int Period
    {
        get {return period;}
        set { period = value;}
    }
    
    public abstract double Rate();

    public double Emi()
    { 
        double emi = 0;
     return emi = principle * (1 + Rate() * period / 100) / (12 * period);
    }
    
}
