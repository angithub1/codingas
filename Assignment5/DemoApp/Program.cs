using LoanLib;

public class Program
{
     public static void Main(string[] args)
    {
       double amount = double.Parse(args[0]);
       int years = int.Parse(args[1]);

       PersonalLoan pl = new PersonalLoan(amount, years);
       Console.WriteLine("EMI for personal loan is {0:0.00}", pl.Emi());
       Console.WriteLine("Tax on EMI is {0:0.00}", pl.Tax());

       Console.WriteLine("=====================================================");

       HomeLoan hl = new HomeLoan(amount, years);
       Console.WriteLine("EMI for home loan is {0:0.00}", hl.Emi());
       Console.WriteLine("Discount on EMI is {0:0.00}", hl.Discount());

    }

}