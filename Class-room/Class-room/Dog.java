/*
Dog.java
alberto veg vega
this class stas the dog´s propertier and methods

*/
import  javax.swing.JOptionPane;
public class Dog{

  //Dog´s properties - Variabless
  private String color;
  private String eyeColor;
  private double height;
  private double length;
  private double weight;

  public void setColor(String color){
    color=color;
  }
    public String getColor(){
      return color;
    }
    public void setEyeColor(String eyeColor){
      eyeColor=eyeColor;
    }
    public String getEyeColor(){
      return eyeColor;
    }
    public void setHeight(String height){
      height=height;
    }
    public double getHeight(){
      return height;
    }
    public void setLenght(String length){
      length=length;
    }
    public double getLength(){
      return length;
    }
    public void getWeight(String weight){
      weight=weight;
    }
    public double setWeight(){
       return weight;
    }

    public void sit(){
      JOptionPane.showMessageDialog(null, "the dog is sat");
    }
    public void bark(){
      JOptionPane.showMessageDialog(null, "the dog is barking");
    }
    public void layDown(){
      JOptionPane.showMessageDialog(null, "the dog is layd down");
    }
    public void sleep(){
      JOptionPane.showMessageDialog(null, "the dog is sleepeing");
    }
    public void eat(){
      JOptionPane.showMessageDialog(null, "the dog is eating ");

    }
}
