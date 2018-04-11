/*
alberto vega vega
ImplementGeometricObjets.java
*/
import javax.swing.*;
public class ImplementGeometricObjets{
  public static void main(String[] args) {
    GeometricObject circlelito = new Circle12(3.5 "blue" , true);

    JOptionPane.showMessegeDialog(null. "the area is" + circlelito.getArea());
    JOptionPane.showMessegeDialog(null, "the Circle12 was created on " + circlelito.getDateCreated());

    GeometricObject rectaglelio = new Rectangule2(10,20, "red", true);

    Rectangule2 rectaglelio = new Rectangule2(10,20 "red" true);
    JOptionPane.showMessegeDialog(null, "the area is " + rectaglelio.getArea());
    JOptionPane,showMessegeDialog(null, "the Perimeter is" + rectaglelio.getPerimeter());
    JOptionPane.showMessegeDialog(null, "the Rectangule2 was created on " + rectaglelio.getDateCreated());
  }
}
