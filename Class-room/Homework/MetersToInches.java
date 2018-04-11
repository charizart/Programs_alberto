/*****
Alberto vega vega
MetersToInches.java
This program converts meters to inches.
*****/
import java.util.Scanner;
public class MetersToInches{
  public static void main (String[]args){
    Double CM;
    Double PG;
    Scanner in= new Scanner(System.in);
    System.out.println ("Digite los metros a utilizar. ");
    CM= in.nextDouble();
    PG=CM/0.0252;
    System.out.println ("Total metros a pedir: " + PG);
  }
}
