public class MyInteger {

	private int number;

	//Non-parameterized constructor 
	public MyInteger() {
		this(0);
	}

	//parameterized constructor
	public MyInteger(int number) {
		this.number = number;
	}

	public int getNumber() {
	       	return number;
       	}

	public void setNumber(int number) { 
		this.number = number; 
	}
       
       public boolean isNegative() {
          if(number < 0) {
		  return true;
            
	  }
	  else {
		  return false;
	  }
       }       

       public boolean isPositive() {
          if(number > 0) {
		  return true;
             
	  }
	  else{
		  return false;
	  }
       }       

       public boolean isZero() {
         if(number == 0) {
		  return true;
               
	 }
	 else{
		 return false;
	 }
       } 

       public boolean isOdd() {
	 if(number % 2 == 1) {
		  return true;
	       
	 }
	 else {
		 return false;
	 }
       }

       public boolean isEven() {
         if(number % 2 == 0) {
		  return true;
	      
	 }
	 else{
		 return false;
	 }
       }
}




