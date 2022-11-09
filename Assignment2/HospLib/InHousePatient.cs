
namespace HospLib 
{
   public class InHousePatient : Patient
    {
        //private double Discount;

        public InHousePatient(int patientId, string pname, int btype, int days) : base(patientId, pname, btype, days)
        {
           //  Discount = disc;
        }

        public InHousePatient() : this (101, "jack", 1, 200)
        {

        }


         public override double GetBillAmount()
         {
           double amount = 0;
            double total = base.GetBillAmount();
           if (total > 20000)
           {
             amount = total * 0.95d;
             return amount;
           }
           else
           {
            return total;
           }
            
         }

    

    }

}