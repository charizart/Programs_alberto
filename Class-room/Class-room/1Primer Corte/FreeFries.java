/********************************************
Alberto vega vega
FreeFries.java
this program reads points scored by home team
and the opposing team and determines If the fans win free
*********************************************/
import javax.swing.JOptionPane;
public class FreeFries{
  public static void main(String[] args) {
    int homePoints;
    int opponentPoints;
    homePoints =Integer.parseInt(JOptionPane.showInputDialog("enter home points"));
    opponentPoints=Integer.parseInt(JOptionPane.showInputDialog("enter opponent points"));
    if (homePoints > opponentPoints && homePoints >= 100 ){
      JOptionPane.showMessageDialog(null,"A free order of french for white tigers fans");
    }

  }
}
