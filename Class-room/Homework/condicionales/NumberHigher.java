/*************************************************************
Alberto vega vega
NumberHigher.java

This program detected number higher
**************************************************************/
import javax.swing.JOptionPane;
public class NumberHigher{
  public static void main(String[]args){
    int number1, number2;
    number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number one"));
    number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number two"));
    if (number1 > number2) {
      JOptionPane.showMessageDialog(null,"Number one is higher "+number1);
    }else if (number2 > number1) {
      JOptionPane.showMessageDialog(null,"Number two is higher "+number2);
    }//end if
  }//end main
}//end the program
