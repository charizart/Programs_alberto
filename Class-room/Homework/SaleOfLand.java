/*****
Alberto vega vega
SaleOfLand.java
This program calculates the area of some lands.
*****/
import java.util.Scanner;
public class SaleOfLand{
  public static void main (String[]args){
    Double B; //Base del triangulo y del rectangulo
    Double A; //Añtura del triangulo y rectangulo unidos
    Double C; //altura del rectangulo
    Double AT;
    Double AR;
    Double Area;
    Scanner in= new Scanner(System.in);
    System.out.println ("Para calcular el precio del terreno, ingrese las medidas en metros: ");
    System.out.println ("Digite base de las figuras: ");
    B = in.nextDouble();
    System.out.println ("Digite altura de la figura: ");
    A = in.nextDouble();
    System.out.println ("Digite altura del triangulo: ");
    C = in.nextDouble();
    AT = (B*(A-C))/2;
    AR = (B*C);
    Area = AT+AR;
    System.out.print ("El area total de la figura es de " + Area + " metros");
  }
}
