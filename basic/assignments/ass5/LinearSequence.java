package common;

public class LinearSequence implements Sequence {

	private double current;
	private double difference;

	public LinearSequence(double crt , double diff){
		current = crt;
		difference = diff;
	}

      public double next(){
		double nextTerm = current;
		current += difference;
		return nextTerm;
	}
}



