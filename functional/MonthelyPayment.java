package functional;
import java.lang.Math;

public class MonthelyPayment {
	
	public static float monthelypayment(float P,float Y,float R) {
	 
		
	float n = 12 * Y;
	float r = R / ( 12*100 );
	float	payment = (float) ((float)(P * r)/ (1-Math.pow((1 + r),-n)));
	return payment;
	}


public static void main(String args[]) {
	
	float P = Float.parseFloat(args[0]);
	float Y = Float.parseFloat(args[0]);
	float R = Float.parseFloat(args[0]);
	float cheackpayment = monthelypayment(P,Y,R);
	System.out.println(+cheackpayment);
}
	
}
