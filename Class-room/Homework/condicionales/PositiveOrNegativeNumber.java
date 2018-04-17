/*******************************************************
Alberto vega vega
PositiveOrNegativeNumber.java

This program tells if a number is positive or negative
*******************************************************/
import javax.swing.JOptionPane;
public class PositiveOrNegativeNumber{
  public static void main (String[]args)
  {
    int n;
    n=Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
    if (n>0)
    {
      JOptionPane.showMessageDialog(null, "The number is positive");
    }else{
      JOptionPane.showMessageDialog(null, "The number is negative");
    }//end else
  }//end main
}//end class
