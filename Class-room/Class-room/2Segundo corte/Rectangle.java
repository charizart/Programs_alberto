/*******************************************************************************
Rectangle.java
Pedro uriel de jesus cortez
This class implements a rectangle with constructor
********************************************************************************/
import javax.swing.*;
public class Rectangle{
  //attributes o propierties
  private double height;
  private double width;
public Rectangle (){
  this.height=10;
  this.width=20;
}
public Rectangle (double height, double width){
  this.height=height;
  this.width=width;
}
public double getArea(){
  return this.height*this.width;
}
public static void main(String[] args) {
  Rectangle rectangle = new Rectangle();
  JOptionPane.showMessageDialog(null,"the area is "+rectangle.getArea());

  Rectangle rectangle2 = new Rectangle(5, 10);
  JOptionPane.showMessageDialog(null, "the rectangle2 area is "+ rectangle2.getArea());
}
}
