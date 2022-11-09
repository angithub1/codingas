import billing.Patient;
import billing.InHouse;

 class Hospitaltest {

	 public static void main(String[] args) {
		 int id = Integer.parseInt(args[0]);
		 int type = Integer.parseInt(args[1]);
		 int days = Integer.parseInt(args[2]);

		 Patient p = new Patient(id, type, days);
		 double d=0;
	         InHouse i = new InHouse(id, type, days, d);

		 System.out.printf("regular patient bill is %.2f%n", p.getbillAmount());
		 System.out.printf("inhouse patient bill is %.2f%n", i.getbillAmount());
 }


 }
