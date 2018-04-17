/********************
Alberto vega vega
Banquet.java

This Program Calculate price of banquet
********************/
import javax.swing.JOptionPane;
public class Banquet{
  public static void main(String[]args){
    double np;
    double tot;

    np = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of dishes"));

    if (np >= 200 && np < 300) {
      tot = (np*85);
      JOptionPane.showMessageDialog(null,"The total price of the banquet is "+"$"+tot);
    }else if (np < 200) {
      tot = (np*95);
      JOptionPane.showMessageDialog(null,"The total price of the banquet is "+"$"+tot);
    }else if (np > 300) {
      tot = (np*75);
      JOptionPane.showMessageDialog(null,"The total price of the banquet is "+"$"+tot);
    }//end if
  }//end main
}//end the program
