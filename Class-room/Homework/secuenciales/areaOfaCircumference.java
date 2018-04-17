/*******************************
Alberto vega vega
areaOfaCircumference.java

this program prints the area of a circumference
*/
import java.util.Scanner;

public class areaOfaCircumference{
 public static void main(String args[]){
   int radio;
   final double pi=3.1416;
   final double result;
   System.out.println("Enter radio of circle");
   Scanner R = new Scanner (System.in);
   radio = R.nextInt();
    result= ((radio*radio)*pi);
   System.out.println("area Of a Circle"+result);

 }//end main
}//end CircunferenciaArea
