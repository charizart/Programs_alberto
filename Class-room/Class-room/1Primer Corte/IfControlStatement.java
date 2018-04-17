/*****************************************
Alberto vega vega
IfControlStatement.java

this program check for period at the end of line
******************************************/
import javax.swing.JOptionPane;
public class IfControlStatement{
  public static void main(String[] args) {
    String sentence;
    int lastCharPosition;
    sentence = JOptionPane.showInputDialog("enter you sentence");
    lastCharPosition = sentence.length() -1;
    JOptionPane.showMessageDialog(null, sentence.charAt(lastCharPosition));
    if (sentence.charAt(lastCharPosition)!='.'){
      JOptionPane.showMessageDialog(null, "invalid entry - your sentence needs a period");


    }//end if
  }//end main
}//end class
