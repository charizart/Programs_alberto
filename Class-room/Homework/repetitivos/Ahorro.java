/*******************************************************************************
Alberto vega vega
Ahorro.java

this program calculates how much a person saves in a year
********************************************************************************/
import javax.swing.JOptionPane;
public class Ahorro {
  public static void main(String[] args) {
    double cAhorrada = 0, mAhorro;
    for (int i = 1; i<=12; i++)  {
      mAhorro = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to be saved in the month " + i));
      JOptionPane.showMessageDialog(null, "The amount saved in the month " + i + " is: " + mAhorro);
      cAhorrada += mAhorro;
    }
    JOptionPane.showMessageDialog(null, "The amount saved in the year is: " + cAhorrada);
  }
}
