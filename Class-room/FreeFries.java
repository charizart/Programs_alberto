/****************************
Alberto vega vega
Programs FreeFries.java
This program reads points score by home team adn the opposing team and determinates
IF the fans win free french fries
****/
import javax.swing.JOptionPane;
public class FreeFries
{
  public static void main(String[]args)
  {
    int homePoints;
    int opponentPoints;
    homePoints =
    Integer.parseInt(JOptionPane.showInputDialog("Enter home points"));
    opponentPoints =
    Integer.parseInt(JOptionPane.showInputDialog("Enter opponent points"));
    if (homePoints>opponentPoints && homePoints >= 100)
    {
      JOptionPane.showMessageDialog(null, "A free order of French Fries for White Tigers Fans");
    }
  }
}
