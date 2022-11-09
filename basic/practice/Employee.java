
public class Employee {

	private int id;
	private int hours;
	private float rate;
	protected int count;

	public Employee(int eid, int hrs, float rt) {
		id = eid;
		hours = hrs;
		rate = rt;
		count++;
	}

	public Employee() {
		this(101,120,100);
	}

	public int getId() {
		return id;
	}
	public void setId(int eid) {
		id = eid;
	}

	public int getHours() {
		return hours;
	}
	public void setHours(int hrs) {
		hours = hrs;
	}

	public float getRate() {
		return rate;
	}
	public void setRate(float rt) {
		rate = rt;
	}

	public int getCount() {
		return count;
	}

	public double getIncome() {
		int ot;
		if(hours > 120) {
			ot = (hours-120)*200;
		}
		else 
			ot = 0;

		return hours * rate + ot;
	}
}







