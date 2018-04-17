/***************************************************
Alberto vega vega
Dog.java
this class sets the dog´s properties and methods
***************************************************/
import javax.swing.*;
/*metod get-optener
metodo set-establecer*/

public class Dog{
  //dog´s properties - variables
  private String color,eyecolor;
  private double height,lenght,wight;
  //dog´s methods - action
  public void setcolor(String dogColor){ //set´s the dog color
    color = dogColor;
  }
  public String getColor(){ //get´s the dog´s  color
    return color;
  }
  public void setEyeColor(String dogEyecolor){ //set´s dog´s eyecolor
    eyecolor=dogEyecolor;
  }
  public String getEyeColor(){
    return eyecolor;
  }
  public void setHeight(double dogHeight){
    height=dogHeight;
  }
  public double getHeight(){
    return height;
  }
  public void setLenght(double dogLenght){
    lenght=dogLenght;
  }
  public double getLenght(){
    return lenght;
  }
  public void setWight(double dogWight){
    wight=dogWight;
  }
  public double getWight(){
    return wight;
  }




  public void sit(){
    JOptionPane.showMessageDialog(null, "the dog is sat");
  }
  //bark methods
  public void bark(){
    JOptionPane.showMessageDialog(null, "the dog is barking");
  }
  //lay Down methods
  public void layDown(){
    JOptionPane.showMessageDialog(null, "the dog is layDown");
  }
  //eating methods
  public void eating(){
    JOptionPane.showMessageDialog(null, "the dog is eating");
  }
  //seeping methods
  public void sleeping(){
    JOptionPane.showMessageDialog(null, "the dog is sleeping");
  }
}
