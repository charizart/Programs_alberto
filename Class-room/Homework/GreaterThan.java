/************
GreaterThan.java
alberto vega vega
This program compare two numbers
************/

import javax.swing.JOptionPane;
public class GreaterThan
{
  public static void main (String[]args)
  {
    int A, B;
    A=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
    B=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
    if (A>B)
    {
      JOptionPane.showMessageDialog(null, "The greater number is: " + A);
    }else{
      JOptionPane.showMessageDialog(null, "The greater number is: " + B);
    }
  }
}
