/*
TwentyFive.java
alberto vega vega
Write a program that reads a list of "N" numbers and determine how many are posistive,
and how many are negative.
*/
import javax.swing.JOptionPane;
public class TwentyFive{
  public static void main(String[] args) {
    int numberOfNumbers, numbers;
    int positive = 0, negative = 0;
    numberOfNumbers = Integer.parseInt(JOptionPane.showInputDialog("Enter the numbers"));
    for (int i = 1; i <= numberOfNumbers; i++ ) {
      numbers = Integer.parseInt(JOptionPane.showInputDialog("Number "+ i));
      if (numbers > 0) {
        positive=positive+1;
      }else if (numbers < 0) {
        negative=negative+1;
      }
    }
    JOptionPane.showMessageDialog(null, "The positive numbers are: " + positive +
    "\n The negative numbers are: " + negative);
  }
}
