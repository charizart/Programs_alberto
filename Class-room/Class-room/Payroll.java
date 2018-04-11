import javax.swing.*;

public class Payroll{
  public static void main(String[] args) {
      String name = JOptionPane.showInputDialog("salaried's name");
      double salary = Double.parseDouble(JOptionPane.showInputDialog("salaried's salary"));

      Employee sasuke = new Salaried()


      name = JOptionPane.showInputDialog("salaried's name");
      double hours =
      Double.perseDouble(JOptionPane.showInputDialog("hours worked"));
      Employee sakura = new hourly(name, hours);

      JOptionPane.showMessegeDialog(null, "sakura's pay" + sakura.getPay());

      Commission shikamaru = new Commission("shikamaro");
      shikamaro.addSales(550);
      shikamaro.addSales(1220);

  }
}
