package common;

public interface Sequence{

	double next();

	default double sum(int count){

	int i;
	double total=0;
	
        for(i=1; i<=count; ++i){
		total += next();
	}

	return total;

	}

}

