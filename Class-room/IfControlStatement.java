
/******************************************************************
Alberto vega vega
IfControlStatement.java
This program checks for period at the end of line
*****/
import javax.swing.JOptionPane;
public class IfControlStatement{
  public static void main(String[]args){
    String sentence;
    int lastChartPosition;
    sentence=JOptionPane.showInputDialog("Enter your sentence");

    lastChartPosition=sentence.length () -1;
    if (sentence.charAt(lastChartPosition) != '.'){
    JOptionPane.showMessageDialog(null, "Invalid Entry - Your sentence needs a period");
    }
  }
}
