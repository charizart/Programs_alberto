/*
alberto vega vega
Circle12.java
*/
import javax.swing.*;

public class Circle12 extends GeometricObject{
  private double radius;

  public Circle12(){

  }
  public Circle12(double radius){
    this.radius=radius;
  }

  public Circle12(double radius, String color, boolean filled){
    super(color,filled);
    this.radius=radius;
  }
  public getRadius(){
    return this.radius
  }
  public void setRadius(double radius){
    this.radius=radius;
  }
  public double getArea(){
    return Math.pi * Math.pow(this.radius, 2);
  }
  public double getPerimeter(){
    return Math.pi * (this.radius * 2);
  }
  public double getDiameter(){
    return this.radius * 2;
  }
  @verrive
  public String toString(){
    return "date created" + super.getDateCreated()
            "\n color " + super.getColor() + "\n area " + getArea();
  }

  //public void pritCircle12(){
    //JOptionPane.showMessegeDialog(null, "the Circle12 created " + getDateCreated() + "has color:" + getColor());
  }
}
