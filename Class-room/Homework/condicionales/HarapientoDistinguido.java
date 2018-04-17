/********************************************************
Alberto vega vega
HarapientoDistinguido.java

This program is for Costomes
********************************************************/
import javax.swing.JOptionPane;
public class HarapientoDistinguido{
  public static void main(String[]args){
    int ct;
    double de,pf;
    ct = Integer.parseInt(JOptionPane.showInputDialog("enter the price of your suit"));
    if (ct >= 2500) {
      de = (ct*15)/100;
      pf = (ct-de);
      JOptionPane.showMessageDialog(null,"The price of your suit is $"+pf+" with discount of %15");
    }else{
      de = (ct*8)/100;
      pf = (ct-de);
      JOptionPane.showMessageDialog(null,"The price of your suit is $"+pf+" with discount of %8");
    }//end if
  }//end main
}//end the program
