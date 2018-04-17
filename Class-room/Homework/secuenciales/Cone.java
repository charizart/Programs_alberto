/*****************************************************************
Alberto vega vega
Area Of The cone

Ths program is for area cone
******************************************************************/
import java.util.Scanner;

 public class Cone{
   public static void main(String[]args){
     int r,h,at;
     double ac,area;
     final double pi=3.1416;
     System.out.println("Enter the cone radio");
     Scanner R= new Scanner (System.in);
     r=R.nextInt();
     System.out.println("Enter the hypotenuse of the cone");
     Scanner H= new Scanner (System.in);
     h=H.nextInt();
     at= ((r*2)*h);
     ac= (((r*r)*pi)/2);
     area= (at+ac);
     System.out.println("The area of the cone is "+area);
   }//end main
 }//end class
