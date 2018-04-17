/*****************************************************************************
Alberto vega vega

Circle.java

thus class calculates the area of a circle
**************************************************************************/
import javax.swing.*;
public class Circle{
  //propierties
  private double Radius;
  //contructor
  public Circle(){

  }
public Circle(double radius){
  this.Radius=radius;
}



  //methods
  public void setRadius (double radius){
    this.Radius=radius;
  }
  public void getRadius(){
    return this.Radius;
  }
  public double getArea(){
    return Math.pow(this.Radius, 2)* Math.PI;
  }

public static void main(String[] args) {
  double radius=Double.parseDouble(JOptionPane.showInputDialog("enter the radius"));
  Circle circle= new Circle(radius);
  JOptionPane.showMessageDialog(null,"the circle´s area with a radius of " + circle.getRadius()+" is "+circle.getArea());
}


}//enD CLASS
