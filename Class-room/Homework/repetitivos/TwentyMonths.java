/************************************************************************************************
Alberto vega vega
TwentyMonths.java

this program calculates how much a person must pay monthly and how much to pay after 20 months
*************************************************************************************************/
import javax.swing.JOptionPane;
public class TwentyMonths{
  public static void main(String[] args)  {
    double pMes = 10, pTotal = 0;
    for ( int i = 1; i<=20; i++)  {
      pTotal += pMes;
      JOptionPane.showMessageDialog(null, "Payment of the month " + i + " is: " + pMes);
      pMes *= 2;
    }
    JOptionPane.showMessageDialog(null, "The total payment after 20 months is: " + pTotal);
  }
}
