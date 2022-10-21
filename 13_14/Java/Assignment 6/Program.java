import banking.*;

 public class Program {

	 public static void main(String[] args) {
		 double a = Double.parseDouble(args[0]);
		 int b = Integer.parseInt(args[1]);
		
		 HomeLoan hl = new HomeLoan(a,b);
		 System.out.printf("monthly installment for home loan : %.2f%n",hl.getNetEmi());
		 
		 PersonalLoan pl = new PersonalLoan(a,b);
		 System.out.printf("monthly installment for personal loan : %.2f%n",pl.getNetEmi());

	 }
 }

