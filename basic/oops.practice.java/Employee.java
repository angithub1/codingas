class Employee {

     private int id;
     private int age;
     private double hours;
     private double rate;

     public Employee() {
	     id = 101;
	     age = 30;
	     hours = 200;
	     rate = 100;
     }
     public Employee(int eid, int ag, double hrs, double rt) {
	     id = eid;
	     age = ag;
	     hours = hrs;
	     rate = rt;
     }
     public double getOverTime() {
	     double ot = 0;
	     if(hours > 200) {
		     ot = (hours - 200) * 200;
	     }
		     return ot;
	     }
     public double getIncome() {
          return (hours * rate) + getOverTime();
     }


     
}

