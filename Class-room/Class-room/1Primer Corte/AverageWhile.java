/********************************************
Alberto vega vega
AverageWhile.java
this program calculates the average of ten grades
*********************************************/
import javax.swing.JOptionPane;
public class AverageWhile{
  public static void main(String[] args) {
    int counter=1, totalstudents;
    double score, totalscore=0, averagescore;
    totalstudents = Integer.parseInt(JOptionPane.showInputDialog("enter number of students"));
    while (counter <= totalstudents){
      score = Double.parseDouble(JOptionPane.showInputDialog("enter the score "+counter ));
      totalscore += score;
      counter ++;

    }
  averagescore=totalscore/totalstudents;
  JOptionPane.showMessageDialog(null,"the average is " + averagescore);

  }
}
