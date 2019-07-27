package functional;
import java.util.Scanner;

public class TempretureConversion {
	public static float tempretureConversion(float temp,float method) {
		float tempconverted = 0;
		if(method=='f' || method=='F'){
			
			tempconverted =  (temp * 9/5) + 32 ;
		}
			else if(method =='c'|| method=='C') {
				tempconverted = (temp- 32) * 5/9;
				
			}
		return tempconverted;
				
		}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a temp value");
		float temp =scanner.nextFloat();
		 float cel = tempretureConversion(temp,'c');
		 System.out.println("celicious vlaue "+cel);
		 float fer = tempretureConversion(temp,'f');
		 System.out.println("fernhight value  "+fer);
	}
		
	}



