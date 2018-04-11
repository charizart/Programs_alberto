/******
alberto vega vega
Cloth.java
This program convert meters to inches
******/

import java.util.Scanner;
public class Cloth{
    public static void main (String[]args){

      Scanner userData = new Scanner(System.in);
      double CM;
      System.out.print("Ingrese cantidad de M: ");
      CM= userData.nextDouble();
      System.out.println ("La cantidad en pulgadas es: " + CM*39.3701);
    }
}
