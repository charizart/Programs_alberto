/*
alberto vega vega
Rectangule2.java
*/
import javax.swing.*;

public class Rectangule2 extends GeometricObject{
  private double area;
  private double base;
  public Rectangule2(){

  }
  public Rectangule2(double base double area){
    this.base=base;
    this.area=area;
  }

  public Circle12(double base, double area String color, boolean filled){
    super(color,filled);
    this.base=base;
    this.area=area;
  }
  public getBase(){
    return this.base
  }
  public void setBase(double base){
    this.base=base
  }
  public getArea(){
    return this.area
  }
  public void setArea(double area){
    this.area=area;
  }
  public double getArea(){
    return (area*base);
  }
  public double getPerimeter(){
    return lado + lado;
  }


  public void pritRectangula2(){
    JOptionPane.showMessegeDialog(null, "the Rectangule2 created " + getDateCreated() + "has color:" + getColor());
  }
}
