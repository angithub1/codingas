class GetRandomNumber{

	public static void main(String [] args) {

	double min = 1000000;
        double max = 9000000;

	System.out.println( "Random value between "+min+"to"+max+"" );
	double a = Math.random() * ((max - min + 1) + min);
	System.out.print(a);
	}
}



