/*
Alberto vega vega

program WhileLoop.java
this program makes entries in a bridal registry
*/
import javax.swwing.JOptionPane;

public class WhileLoop{
  public static void main(String[] args) {
      String registry = "";
      char more;

      more = JOptionPane.showInputDialog("do you want to create a bridal registry (y/n)").charAt(0);

      while(more ==´y´ || more == ´Y´ ){ registry += JOptionPane.showInputDialog("enter item: ");
        registry += "\n";
        JOptionPane.showInputDialog("enter store \n");
        registry += "\n";
        more = JOptionPane.showInputDialog("any more items? (y/n)".charAt(0));
      }//end while
      if (!registry.equals("")) {
        JOptionPane.showInputDialog(null, "\nBridal registry\n" + registry);

      }


  }
}
