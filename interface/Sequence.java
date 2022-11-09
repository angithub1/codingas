 public interface Sequence {

	 double next();

	 default double sum(int n) {

		 int i;
		 double total = 0;
		  for (i=1; i<=n; ++i) {
			  total = total + next();
		  }
		  return total;
	 }
 }

