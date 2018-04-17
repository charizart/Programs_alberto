/*********************************************************************************
Alberto vega vega
Zero.java

This program calculates how many quantities are less than zero, hoy many are greater than zero and how many are zero
**********************************************************************************/
import javax.swing.JOptionPane;
public class Zero {
  public static void main(String[] args)  {
    double numero;
    int mayorCero = 0, menorCero = 0, c = 1, cantidadNumeros;
    cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingest the number of numbers to calculate"));
    do {
      numero = Double.parseDouble(JOptionPane.showInputDialog("Enter number " + c));
      if (numero>0) {
        mayorCero += 1;
      }else
      if (numero<=0) {
        menorCero += 1;
      }c ++;
    }
    while(c<=cantidadNumeros);
    JOptionPane.showMessageDialog(null, "The total of numbers greater than zero is: " + mayorCero + "\nThe total of numbers less than or equal to zero is: " + menorCero);
  }
}
