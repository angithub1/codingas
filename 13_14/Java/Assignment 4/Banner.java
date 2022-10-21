package business;

 public class Banner{

	 private int width;
	 private int height ;

	 public Banner() {
		
	 width = 10;
	 height = 100;
	 
	 }

	 public Banner(int w, int h) {
		 width = w;
		 height = h;
	 }

	 public int getWidth() {
		 return width;
	 }

	 public void setWidth(int w) {
		 width = w;
	 }

	 public int getHeight() {
		 return height;
	 }

	 public void setHeight(int h) {
		 height = h;
	 }

	 public double getArea(){
		 double area = width * height;
		 return area;
	 }




 }
