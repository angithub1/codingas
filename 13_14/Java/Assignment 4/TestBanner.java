import business.Banner;
import business.CurvedBanner;

 public class TestBanner {

	 public static void main(String[] args){
	 int w = Integer.parseInt(args[0]);
	 int h = Integer.parseInt(args[1]);
         double r = Double.parseDouble(args[2]);

	 Banner b = new Banner();
           System.out.printf("Area of regular banner : %f%n", b.getArea());

	 CurvedBanner c = new CurvedBanner();
	   System.out.printf("Area of curved banner : %f%n", c.getArea());

   }
 }
