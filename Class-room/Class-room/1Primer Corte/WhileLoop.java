/****************************************
Alberto vega vega
WhileLoop.java
this program
***************************************************/

import javax.swing.JOptionPane;
public class WhileLoop{
  public static void main(String[] args) {
    String registry ="";
    char more;
    more = JOptionPane.showInputDialog("Do you want to create a bridal registry? (y/n)").charAt(0);
    while (more == 'y' || more =='Y'){
      registry += JOptionPane.showInputDialog("enter item:" );
      registry += JOptionPane.showInputDialog("enter store:" );
      registry += "\n";
      more = JOptionPane.showInputDialog("any more items? (n/y)").charAt(0);

    }//end while

    if (registry.equals("")){
      JOptionPane.showMessageDialog(null,"\n"+ registry);
    }//end if
  }//end main
}//end class
