package common;

public class PowerSequence implements Sequence{

	private double current;
	private double ratio;

	public PowerSequence(double c, double r){
		current = c;
		ratio = r;
	}

         public	double next(){
		double nextTerm = current;
		current *= ratio;
		return nextTerm;
	}
}


