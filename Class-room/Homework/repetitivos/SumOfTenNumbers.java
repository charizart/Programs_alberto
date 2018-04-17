/*******************************************************
Alberto vega vega
SumOfTenNumbers.java

This program calculates the sum of ten amounts
*********************************************************/
import javax.swing.JOptionPane;
public class SumOfTenNumbers {
  public static void main(String[] args){
    double numero, suma=0;
    int c=1;
    while (c<=10) {
      numero = Double.parseDouble(JOptionPane.showInputDialog("Enter number " + c));
      suma += numero;
      c++;
    }
    JOptionPane.showMessageDialog(null, "The sum of the numbers is: " + suma);
  }
}
