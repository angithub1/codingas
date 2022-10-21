package billing;

 public class Patient {

	 private int patientId;
	 private int bedType;
	 private int totalDays;

	 public Patient(){
            this(101, 1, 60);
	 }

	 public Patient(int id, int type, int days) {
		 patientId = id;
		 bedType = type;
		 totalDays = days;
	 }

	 public int getpatientId() {
		 return patientId;
	 }

	 public void setpatientId(int id) {
		 patientId = id;
	 }



	 public int getbedType() {
		 return bedType;
	 }

	 public void setbedType(int type) {
		 bedType = type;
	 }


	 public int gettotalDays() {
		 return totalDays;
	 }

	 public void settotalDays(int days) {
		 totalDays = days;
	 }

         public double getbillAmount() {
		 int price = 0;
		 if (bedType==1) {
			 price = 500;
		 }
		 if (bedType==2) {
			 price = 350;
		 }
		 if (bedType==3) {
			 price = 200;
		 }
		 return totalDays * price;
	 }


 }
