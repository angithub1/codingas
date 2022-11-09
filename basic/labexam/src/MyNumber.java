package utility;
public  class MyNumber implements IntDefine {

	private int num;

	//Non-parameterized constructor 
	public MyNumber() {
		this(0);
	}

	//parameterized constructor
	public MyNumber(int num) {
		this.num = num;
	}

	public int getNum() {
	       	return num;
       	}

	public void setNum(int num) { 
		this.num = num; 
	}
       
       public boolean isNegative() {
          if(num < 0) {
		  return true;
            
	  }
	  else {
		  return false;
	  }
       }       

       public boolean isPositive() {
          if(num > 0) {
		  return true;
             
	  }
	  else{
		  return false;
	  }
       }       

       public boolean isZero() {
         if(num == 0) {
		  return true;
               
	 }
	 else{
		 return false;
	 }
       } 

       public boolean isOdd() {
	 if(num % 2 == 1) {
		  return true;
	       
	 }
	 else {
		 return false;
	 }
       }

       public boolean isEven() {
         if(num % 2 == 0) {
		  return true;
	      
	 }
	 else{
		 return false;
	 }
       }
}




