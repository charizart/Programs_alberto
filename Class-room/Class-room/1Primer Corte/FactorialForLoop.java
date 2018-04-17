/**********************************
Alberto vega vega
FactorialForLoop.java

this program prints the factorial of a number
************************************/
import javax.swing.JOptionPane;
public class FactorialForLoop{
  public static void main(String[] args) {
    int factorial=1 , number;
    number=Integer.parseInt(JOptionPane.showInputDialog("enther the number"));
    for (int i=1;i<=number ;i++ ) {
      factorial*=i;

    }
    JOptionPane.showMessageDialog(null,"the factorial of "+number+" is "+factorial," factorial ",JOptionPane.OK_OPTION);
  }
}
