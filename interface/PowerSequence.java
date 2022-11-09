 
 public class PowerSequence implements Sequence {

	 private double current;
	 private double ratio;


         public PowerSequence() {
		  current=1;
		  ratio=2;
	  }

	 public PowerSequence(double cr, double rt){
		 current = cr;
		 ratio = rt;
	 }

	 public double next() {
		 double nextTerm = current;
		 current = current * ratio;
		 return nextTerm;
	 }
 }

	 


