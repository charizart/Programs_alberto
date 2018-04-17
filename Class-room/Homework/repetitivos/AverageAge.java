/***********************************************************
Alberto vega vega
AverageAge.java

This program calculates the average height
************************************************************/
import javax.swing.JOptionPane;
public class AverageAge{
  public static void main (String[]args)  {
    int C=1,al;
    double PR, Su=0;
    double ES=0;
    al= Integer.parseInt(JOptionPane.showInputDialog("Enter the alumnos number"));
    while( ES <= al)   {
      ES=Double.parseDouble(JOptionPane.showInputDialog("Enter the height "+C));
      Su += ES;
      C ++;
    }//end while
    PR=Su/al;
    JOptionPane.showMessageDialog(null,"The average height is " + PR);
  }//end main
}//end class
