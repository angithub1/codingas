import common.Sequence;
import common.LinearSequence;
import common.PowerSequence;

class Program{

	public static void main(String[] args){

		double current = Double.parseDouble(args[0]);
		double difference = Double.parseDouble(args[1]);
		double ratio = Double.parseDouble(args[2]);
		int count = Integer.parseInt(args[3]);

		LinearSequence a = new LinearSequence(current,difference);
		PowerSequence b = new PowerSequence(current,ratio);


		System.out.printf("First Sum of linear sequence is %s%n", a.sum(count));
		System.out.printf("First Sum of power sequence is %s%n", b.sum(count));
	
		System.out.printf("Second Sum of linear sequence is %s%n", a.sum(count));
		System.out.printf("Second Sum of power sequence is %s%n", b.sum(count));
}
}
