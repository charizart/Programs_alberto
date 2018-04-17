/************************************************************
Alberto vega vega
convertion.java
this program convert bolivianos to dollars and vice versa
ejercice 34
************************************************************/
import javax.swing.*;
public class convertions{
  public static void main(String[] args) {
    int converting;
    double dollar,boliviano;
    converting = JOptionPane.showInputDialog("Que desea realizar \n"+"1.-dolar a boliviano\n"+"2.-boliviano a dolar").charAt(0);
    if(converting == '1'){
      dollar = Double.parseDouble(JOptionPane.showInputDialog("cuantos dolares desea convertir"));
      double res = 6.86*dollar;
      JOptionPane.showMessageDialog(null,"el resultado es "+res+" bolivianos");
    }//end if
    if (converting == '2'){
      boliviano = Double.parseDouble(JOptionPane.showInputDialog("cuantos boliviano desea convertir"));
      double res = boliviano*0.14441;
      JOptionPane.showMessageDialog(null,"el valor es "+res+" dolares");
    }//en if
  }//end static
}//end class
