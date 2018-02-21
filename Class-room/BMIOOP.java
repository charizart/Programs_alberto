/*
alberto vega vega

BMIOOP.java

this class calculates the Body Mass Index
*/

public class BMIOOP{
  //
  private String name;
  private int age;
  private double waigth;
  private double heigth;
  private final double KILOGRAMS_PER_POUND = 0.45359237;
  private final double METERS_PER_INCH = 0.0254;
  //
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public void setEge(int age){
    this.age = age;
  }
  public int getAge(){
    return age;
  }
  public void setWaigth(double waigth){
    this.waigth = waigth;
  }
  public double getWaigth(){
    return waigth
  }
  public void setHeigth(double heigth){
    this.heigth = heigth;
  }
  public double getHeigth(){
    return heigth;
  }

  public getBMI(){
    double bmi = this.weigth * KILOGRAMS_PER_POUND / ((this.heigth * MASTER_PER_INCH) * (this.heigth * MASTER_PER_INCH));
    return Math.round(bmi * 100) / 100;
  }



}
