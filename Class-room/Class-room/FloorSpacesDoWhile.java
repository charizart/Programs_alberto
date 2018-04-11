/**************
alberto vega vega
FloorSpacesDoWhile
this program calculates total floor space in a huse
*/
import javax.swing.JOptionPane;

public class FloorSpacesDoWhile{
  public static void main(String[] args) {
    double length, width;
    double FloorSpaces = 0;

    char responce;

    do {
        length =  Double.parseDouble(JOptionPane.showInputDialog("enter the room´s length","my imput", JOptionPane.));

        length =  Double.parseDouble(JOptionPane.showInputDialog("ent er the room´s width"));

        FloorSpaces += length * width;

      responce = JOptionPane.showInputDialog("any more room?? y/n").charAt(0);
    } while (responce == ´y´ || responce == ´Y´);
    JOptionPane.showInputDialog(null "the total space is "+ FloorSpaces , "wow" , JOptionPane.);

  }

}
