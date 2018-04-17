/***************************************************************************
Alberto vega vega
DogDriver.java

this program creates dog objects and uses dog
***************************************************************************/
import javax.swing.JOptionPane;

public class DogDriver{
  public static void main(String[] args) {
    Dog fido;


    fido = new Dog();
    fido.setcolor("black");
    fido.setEyeColor("gray");
    JOptionPane.showMessageDialog(null, fido.getColor());
    JOptionPane.showMessageDialog(null,fido.getEyeColor());
    fido.eating();
    fido.bark();
    fido.sleeping();

    Dog fufi;
    fufi = new Dog();
    fufi.setcolor("black and blue");
    fufi.setEyeColor("blue");
    JOptionPane.showMessageDialog(null,"color is "+ fufi.getColor());
    JOptionPane.showMessageDialog(null,"eye color is "+ fufi.getEyeColor());
    fufi.sleeping();
    fufi.eating();

  }
}
