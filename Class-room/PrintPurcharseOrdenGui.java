/************************************************************************
Alberto vega vega

PrintPucharseOrden.java

this programs calculates and prinds a PrintPucharseOrden report
************************************************************************/

Imput javax.swing.JOptionPane;

public class PrintPucharseOrden{
  public static void main (String[] args){
    String ItenName;
    double price;
    Int quantity;

    ItenName = JOptionPane.ShowInputDialogo("Enter name of purchase Iten");
    price = Double.parseDouble(JOptionPane.ShowInputDialogo("Enter price of one
    Iten"));
    quantity =
    Intarge.perseInt(JOptionPane.ShowInputDialogo("Enter quantity"));
    JOptionPane.ShowMessageDialogo(null, "purchase order: \n\n" + "Iten: " +
    ItenName+ "\nprice" + price+ "\nQuntity: " + quntity + "\nTotal $ " +
    price * quantity );

    }
  }
