/************
CostSaucer.java
alberto vega vega
This program compare two numbers
************/

import javax.swing.JOptionPane;
public class CostSaucer
{
  public static void main (String[]args)
  {
    int NP, Price, TOT;
    NP=Integer.parseInt(JOptionPane.showInputDialog("Enter the numnber of persons"));
    if (NP<=200)
    {
      Price=95;
    }else{
      if (NP<=300)
      {
        Price=85;
      }else{
        Price=75;
      }
    }
    TOT=NP*Price;
    JOptionPane.showMessageDialog(null, "The Final price is: " + TOT);
  }
}
