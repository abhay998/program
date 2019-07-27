package functional;

import java.util.Scanner;

class DayofWeek
{
 static int dayOfWeek(int month,int day,int year)
  {
   int d,x,m,y;

    y = year - (14 - month)/12;
    x = y - y/4 - y/100 + y/400;
    m = month + 12 * (( 14 - month)/12) - 2;
    d = (day + x + (31*m)/12) %7 ;

   return d; 

  }
    public static void main(String args[])
    {
      int year,month,day;
      Scanner obj = new Scanner(System.in);

      month=Integer.parseInt(args[0]);
      day=Integer.parseInt(args[1]);
      year=Integer.parseInt(args[2]);
   /*  switch (d) {
      case 1:
       System.out.println("It is a Monday "+d);
       break;
       case 2:
       System.out.println("It is a Tuesday ");
       break;
       case 3:
       System.out.println("It is a Wednesday ");
       break;
       case 4:
       System.out.println("It is a Thursday ");
       break;
       case 5:
       System.out.println("It is a Friday ");
       break;
       case 6:
       System.out.println("It is a Satday ");
       break;
       case 0:
       System.out.println("It is a Sunday");
       break;

  */  

      String arrDayOfWeek[] = new String[7];
    		  arrDayOfWeek[0] = "Sunday";
    		  arrDayOfWeek[1] = "moday";
    		  arrDayOfWeek[2] = "tuesday";
    		  arrDayOfWeek[3] = "wednesday";
    		  arrDayOfWeek[4] = "thursday";
    		  arrDayOfWeek[5] = "friday";
    		  arrDayOfWeek[6] = "saturday";
      
      int dayofWeek =  dayOfWeek(month,day,year);
      System.out.print(" "+arrDayOfWeek[dayofWeek]);
    }
  }


