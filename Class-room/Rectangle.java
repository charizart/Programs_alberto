/*
alberto vega Vega
Rectangle.java
this class implements a rectangle with construtor´s
*/
import javax.swing.*;
public class Rectangle{
  //properties
  private double heigth;
  private double width;

  public Rectangle(){
    this.heigth = 10;
    this.width = 20;
  }
  public Rectangle(double heigth, double width){
    this.heigth = heigth;
    this.width = width;
  }

  public double getArea(){
    return this.width * this.heigth;
  }

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    JOptionPane.showMessageDialog(null, "the area is " + rectangle.getArea());

    Rectangle rectangle2 = new Rectangle(5,10);
    JOptionPane.showMessageDialog(null, "the rectangle2´s area is" + rectangle2.getArea());
  }

}
