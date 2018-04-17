/*******************************
Alberto vega vega
ground.java

this program prints the area of a ground
*/
import java.util.Scanner;
public class ground{
  public static void main(String args []){
     int height;
     int Base;
    System.out.println("Go to enter the height");
     Scanner A = new Scanner (System.in);
      height = A.nextInt();
      System.out.println("Go the next base");
       Base = A.nextInt();
     System.out.println( "Area of rectangle is "+(height*Base)/2);
  }//end void main
}//end public class
