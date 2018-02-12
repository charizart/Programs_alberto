/*
FactoryalForLoop.java
alberto vega vega
this program prints the facoryal of a number
*/
import javax.swing.JOptionPane;

public class FactoryalForLoop{
  public static void main(String[] args) {
    int factoryal = 1, number;
    number = Integer.parseInt(JOptionPane.showInputDialog("enter the number "));

    for (int i = 1 ; i <= number ; i++ ) {
      facoryal *= i;

    }
    JOptionPane.showInputDialog(null, "the factoryal of" + number + "is" + facoryal , "FACTORYAL"
    JOptionPane.OK_OPTION);
  }
}
