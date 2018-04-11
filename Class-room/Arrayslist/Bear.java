import javax.swing.*;
import java.util.ArrayList;
public class Bear{

    private final String MAKER;
    private final String TYPE;

    public Bear(String maker, String type){
      this.MAKER=maker;
      this.TYPE=type;

      public void display(){
        JOptionPane.showMessageDialog(null, MAKER + " " TYPE);
      }

      public static void main(String[] args) {
        ArrayList<Bear> TeddyBearStore = new ArrayList<Bear>();
          int opc;

          do{

            opc = Integer.parseInt(JOptionPane.showIputDialog(null,
            "-------menu-------\n 1.- add Bear \n 2.- search --- \n
            3.- remove \n 4.- show all \n 5.- exit" ));

            switch (opc) {
              case 1:
              String maker = JOptionPane.showIputDialog("maker?");
              String type = JOptionPane.showIputDialog("type??");
              Bear teddy = new Bear(maker, type);
              TeddyBearStore.add(teddy);
              break;
              case 2:
              int index = Integer.parseInt(JOptionPane.showIputDialog("index"));
              TeddyBearStore.get(index).display();
              //JOptionPane.showIputDialog("index??");
              //JOptionPane.showMessageDialog(null, TeddyBearStore.get(index));
              break;
              case 3:
              index = Integer.parseInt(JOptionPane.showIputDialog("index to remove"));
              if (TeddyBearStore.remove(index) != null) {
                JOptionPane.showMessageDialog(null, "elemnt removed");

              }else{
                JOptionPane.showMessageDialog(null, "elemnt wasn't removed");
              }
              break;
              case 4:
              for(Bear bear : TeddyBearStore){
                bear.display();
              }
              break;
            }

          }while(opc != 5);
        }
      }
    }
