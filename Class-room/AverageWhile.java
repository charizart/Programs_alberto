/*
Alberto vega vega
AverageWhile.java

*/




import javax.swwing.JOptionPane;

public class AverageWhile{
  public static void main(String[] args) {
    int counter =1, totalStudents;
    double score, totalScore, AverageScore;

    totalStudents =
    Integer.parseInt(JOptionPane.showInputDialog("enter number of students"));
    while(counter <= totalStudents){
      score =
      Double.parseDouble(JOptionPane.showInputDialog("enter the score"+ counter)); counter ++;
    }
    AverageScore = totalScore / totalStudents;
    JOptionPane.showInputDialog(null, "the average is"+ AverageScore);

  }
}
