/********************************************
alberto Vega Vega
Circle.java
This class calculates the area of a circle
**********************************************/
import javax.swing.*;
public class Circle{

  private double radius;

  public Circle(){

  }
  //construtor circle overload
  public Circle(double radius){
    this.radius = radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }
  public double getRadius(){
    return this.radius;
  }

  public double getArea(){
    return Math.pow(this.radius,2)*Math.PI;
  }
  public static void main(String[] args){
    double radius = Double.parseDouble(JOptionPane.showInputDialog("enter the radius"));
    Circle circle = new Circle(radius);
    JOptionPane.showMessageDialog(null, "the circle´s area with a radius of" + circle.getRadius() + "is" + circle.getAre());
    //circle.setRadius(3.14);
    //JOptionPane.showMessageDialog(null, circle.getArea());
  }
}
