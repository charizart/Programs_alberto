/*****
Alerto vega vega
VentaDeLeche.java
This program calculates what will be charged for a gallon of milk and shows the result on the screen.
*****/
import java.util.Scanner;
public class VentaDeLeche{
  public static void main (String[]args){
    int L;
    double PG;
    double TG;
    double GA;

    System.out.println ("Digite precio del galon: ");
    Scanner PG1 = new Scanner (System.in);
    PG=PG1.nextInt();
    System.out.println ("Digite cantidad de litros vendidos");
    Scanner L1 = new Scanner (System.in);
    L=L1.nextInt();
    TG=L*3.785;
    System.out.println ("Cantidad de galones producidos hoy fueron  " + TG);
    GA=TG*PG;
    System.out.println ("La ganancia del dia de hoy fue de $" + GA);
  }
}
