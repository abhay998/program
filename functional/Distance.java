package functional;

public class Distance {

	public static void main(String a[]) {
		int x,y;
		// TODO Auto-generated method stub
		// take a value to command line argument 
		x = Integer.parseInt(a[0]);
	    y = Integer.parseInt(a[1]);
	    // calculate the distance
		 double distance =  Math.sqrt(x*x+y*y);
		 // print the distance
		 System.out.println(+distance);
	}
}
