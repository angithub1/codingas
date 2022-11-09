 
 //The Sequence is interface not a class thats why we have written "implements"
  public class LinearSequence implements Sequence {


	 //field or data members in class
	  private double current;
	  private double difference;
  //parameterless constructor
          public LinearSequence() {
		  current=1;
		  difference=2;
	  }

   //parametrised constructor
	  public LinearSequence(double crt, double diff) {
		  current = crt;
		  difference = diff;
	  }

	  public double next() {
		  double nextTerm = current;
		  current = current + difference;
                  return nextTerm;
	  }
  }

