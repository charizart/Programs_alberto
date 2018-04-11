/************
Pencils.java
alberto vega vega
This program calculate the price for pencils
************/

import javax.swing.JOptionPane;
public class Pencils
{
  public static void main (String[]args)
  {
    int X;
    double Price, Pag;
    X=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pencils"));
    if (X>=100)
    {
      Price=0.85;
    }else{
      Price=0.90;
    }
    Pag=X*Price;
    JOptionPane.showMessageDialog(null, "The price for " + X + " is: " + Pag);
  }
}
