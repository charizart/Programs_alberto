/*******************************
Alberto vega vega
paymentIncubicMeters.java

this program prints the payment per cubic meter
*/
public class paymentIncubicMeters{
  public static void main(String[]args ){
    double longs=30, wide=10, heigh=12, paymentPercubicMeter=15;
    double volume=(longs*wide*heigh);
    double payment=volume*paymentPercubicMeter;
    System.out.println("the payment Per Cubic Meter is ="+payment);
  }//end void main
}//end public class
