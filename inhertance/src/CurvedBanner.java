package business;

 public class CurvedBanner extends Banner {

	 private double radius;

	 public CurvedBanner(){
		 radius = 0.5;
	 }

	 public CurvedBanner(int w, int h, int r) {
		 super(w, h);
		 radius = r;
	 }

	 public double getRadius(){
		 return radius;
	 }

	 public void setRadius(double r) {
		 radius = r;
	 }

	 public double getArea() {
		 double area = super.getArea();
		 return area - (3.14 * radius);
	 }





 }
