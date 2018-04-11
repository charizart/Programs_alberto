/***************************************************************
Alberto vega vega
Rectangule.java
This program prints in display the area of a triangule.
*****/
import java.util.Scanner;
public class Rectangule{

  public static void main (String[]args){
    int A;
    int B;
    int Area;
    Scanner in = new Scanner(System.in);
    System.out.println ("Ingrese la altura del Rectangulo");
    A = in.nextInt();
    System.out.println ("Ingrese la base del Rectangulo");
    B = in.nextInt();
    Area=(B*A);
    System.out.println ("El area del Rectangulo es " + Area);
  }
}
