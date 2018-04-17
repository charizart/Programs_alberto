/******************************************************
Alberto vega vega
Account.java

This program counts from one to one hundred
******************************************************/
import javax.swing.JOptionPane;
public class Account{
  public static void main (String[]args){
    int modulo;
    for (int i=0; i<=100; i ++){
      modulo= i%2;
      if (modulo==0){
        JOptionPane.showMessageDialog(null,i);
      }
    }
  }
}
