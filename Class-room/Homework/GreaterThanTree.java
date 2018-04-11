/************
GreaterThanThree.java
alberto vega vega
This program compare tree numbers
************/

import javax.swing.JOptionPane;
public class GreaterThanTree
{
  public static void main (String[]args)
  {
    int A, B, C;
    A=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
    B=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
    C=Integer.parseInt(JOptionPane.showInputDialog("Enter the third number"));
    if (A > B)
    {
      if (A > C)
      {
        JOptionPane.showMessageDialog(null, "The Greatest Number Is: " + A);
      }
    }
    if (B > A)
    {
      if (B > C)
      {
        JOptionPane.showMessageDialog(null, "The Greatest Number Is: " + B);
      }
    }
    if (C > A)
    {
      if (C > B)
      {
        JOptionPane.showMessageDialog(null, "The Greatest Number Is: " + C);
      }
    }
  }
}
