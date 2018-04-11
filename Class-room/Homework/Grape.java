/************
Grape.java
alberto vega vega
This program calculate the cost per kilogram of grapes
************/

import javax.swing.JOptionPane;
public class Grape
{
  public static void main (String[]args)
  {
    String TI, Inc;
    int TA;
    double P, GA, K;
    TI= JOptionPane.showInputDialog("Enter the type of grape (A o B)");
    TA= JOptionPane.showInputDialog("Enter the sinze of the grape (1 o 2)");
    P= JOptionPane.showInputDialog("Enter the price of the grape");
    K= JOptionPane.showInputDialog("Enter the kilograms of grape produced");
    if (TI=="A")
    {
      if (TA=="1")
      {
        Inc=P+.20;
      }else{
        if (TA=="2")
        {
          Inc=P+.30;
        }
      }
    }
    if (TI=="B")
    {
      if (TA=="1")
      {
        Inc=P-.30;
      }else{
        if (TA=="2")
        {
          Inc=P-.50;
        }
      }
    }
    GA=Inc*K;
    JOptionPane.showMessageDialog(null, "The final gain is: " + GA);
  }
}
