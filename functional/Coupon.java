package functional;
import java.util.Random;
public class Coupon
{
	public static void main(String[] args) 
	{ //* here a string value and then this string value change in character value
		char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        // random class use for calculate the coupan value randomley
        Random random = new Random();
        for (int i = 0; i <= 6; i++) {
            char c = chars[random.nextInt(chars.length)];
           // append the character value in sb object
            sb.append(c);
		}

		String randomcoupon=sb.toString();
		// print the randome coupan number
		System.out.println("Randome coupon number is : "+randomcoupon);	
	}
} 