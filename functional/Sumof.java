package functional;
import java.util.Scanner;

public class Sumof {
    public static void main(String[] args) {
    	
    	
        int n, l;
        // here scanner is class to take the value to the uer
        Scanner scan = new Scanner(System.in);
 	    System.out.print("How Many Element You Want to Store in Array ? ");
        n = scan.nextInt();
        int givenArray[] = new int[n];
        // each element store in the array
        System.out.print("Enter " + n + " Element to Store in Array : ");
        for(l=0; l<n; l++)
        {
            givenArray[l] = scan.nextInt();
        }
        
        
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = i + 1; j < givenArray.length; j++) {
                for (int k = j + 1; k < givenArray.length; k++) {
                    if (givenArray[i] + givenArray[j] + givenArray[k] == 0) {
                        System.out.println("Numbers found : " + givenArray[i] + "," + givenArray[j] + " and " + givenArray[k]);
                    }
                }
            }
        }
    }
}