/*************************************
Alberto vega vega



**********************************/
import javax.swing.JOptionPane;
public class FloorSpaceDoWhile{
  public static void main(String[] args) {
    double length,whidth;//room dimensiones;
    double floorSpace=0;
    char reponse;
    do  {
      length =Double.parseDouble(JOptionPane.showInputDialog("Enther the rooms length"));
      whidth =Double.parseDouble(JOptionPane.showInputDialog("enther the rooms whidth"));
      floorSpace +=length*whidth;
      reponse=JOptionPane.showInputDialog("Any more room? y/n ").charAt(0);
    } while(reponse == 'y' || reponse =='Y');
    JOptionPane.showMessageDialog(null,"the total floor space is : "+floorSpace);
  }
}
