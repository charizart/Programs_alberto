/*
Dog.java
alberto veg vega
this class stas the dog´s propertier and methods

*/

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
    public String getHeight(){
      return height;
    }
    public void setLenght(String length){
      length=length;
    }
    public String getWeight(String weight){
      weight=weight;
    }
    public void setWeight(){
      return weight;
    }

    public void sit(){
      JOptionPane.showMessageDialog(null, "the dog is sat");
    }
    public void bark(){
      JOptionPane.showMessageDialog(null, "the dog is barking");
    }
    public void layDown(){
      JOptionPane.showMessageDialog(null,"the dog is laid down");
    }
    public void sleep(){
      JOptionPane.showMessageDialog(null, "the dog is sleepeing")
    }
    public void eat(){
      JOptionPane.showMessageDialog(null;"the dog is eating")

    }
}
