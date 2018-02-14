/*
alberto vega vega
DogDriver.java
this program create users dog

*/
import javax.swing.JOptionPane;

piblic class DogDriver{
  public static void main(String[] args) {
    Dog fido;

    fido = new Dog();
    fido.setColor("black");
    fido.setEyeColor("gray");

    JOptionPane.showMessageDialog(null, fido.getColor())
    JOptionPane.showMessageDialog(null, fido.getEyeColor())

    fido.eat();
    fido.sleep();
    fido.barck();

    //____________________________________________________________
    Dog frank = new Dog();
    frank.setColor("black and coffen");
    frank.setEyeColor("blues");

    JOptionPane.showMessageDialog(null, "frank eyes color is " + frank.getEyeColor());

    frank.sleep();
  }
}
