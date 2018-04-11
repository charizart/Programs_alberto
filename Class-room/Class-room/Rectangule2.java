/*
alberto vega vega
Rectangule2.java
*/
import javax.swing.*;

public class Rectangule2 extends GeometricObject{
  private double width;
  private double heigh;
  public Rectangule2(){

  }
  public Rectangule2(double heigth double width){
    this.heigth=heigth;
    this.width=width;
  }

  public Rectangule2(double width, double heigth, String color, boolean filled){
    super(color,filled);
    this.width=width;
    this.heigth=heigth;
  }
  public getWidth(){
    return this.width;
  }
  public void setWidth(double width){
    this.width=widtth;
  }
  public getHeigth(){
    return this.heigth;
  }
  public void setHeigth(double heigth){
    this.heigth=heigth;
  }
  public double getHeigth(){
    return this.width*this.heigth;
  }
  public double getPerimeter(){
    return this.width*2+this.heigth*2;
  }
}
