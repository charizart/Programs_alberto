/*******************************
Alberto vega vega
rectangle.java

this program prints the area of a rectangle
*/
import java.util.Scanner;

 public class rectangle{
  public static void main(String args []){
     int height;
     int Base;
    System.out.println("enter the height");
     Scanner A = new Scanner (System.in);
      height = A.nextInt();
      System.out.println("enther the base");
       Base = A.nextInt();
       System.out.println("Area del rectangulo es "+(height*Base));
  }//end void main
}//end public class
