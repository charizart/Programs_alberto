/*
Alberto vega vega
CalculateCircumference.java
This program asks for the radius of a circle and shows its circumference.
*****/
import java.util.Scanner;
public class CalculateCircumference{
  public static void main (String[]args){
    double R;
    double PI=3.1416;
    double Area;
    Scanner in = new Scanner (System.in);
    System.out.println ("Ingresa el radio del circulo");
    R=in.nextDouble();
    Area=PI*(R*R);
    System.out.println ("La circunferencia del circulo es " + Area);
  }
}
