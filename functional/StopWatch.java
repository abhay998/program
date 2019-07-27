package functional;
import java.util.Scanner;


public class StopWatch {
	// strtt time and stop time is nationalised by 0
	static double start = 0, stop = 0;
   // here clculate the strat time
	static void startTime() {
		start = System.currentTimeMillis();
		System.out.println("started at " + start);
	}
    
	static void stopTime() {
		// here calculate the stop time
		stop = System.currentTimeMillis();
		System.out.println("stopped at " + stop);
	}
   
	// here calculate the elapsed time
	static void elapsedTime() {
		System.out.println("elapsed time is " + (stop - start) / 1000);
	}
// drive class
	public static void main(String[] args) {
		// take the value to the user input
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1 to start");
		s.next();
		startTime();
		System.out.println("enter 0 to stop");
		s.hasNext();
		stopTime();
		elapsedTime();
	}
}