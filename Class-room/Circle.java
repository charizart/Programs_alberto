/*

this class
*/
import javax.swing.*;

public class Circle{

  //properties

  private double radius;

  //method

  public void setRadius(double radius){
    this.radius = radius;

    public double getRadius(){
      return this.radius;
    }

    public double getArea(){
      return Math.pow(this.radius, 2) * Math.pi;
    }
    public static void main(String[] args) {
      Circle circle = new circle();
      circle.setRadius(3.14);

      JOptionPane.showMessageDialog(null, Circle.getArea());
    }
    }
  }
}
