/*
Alberto vega vega
programs BMI.Java
this programs calculates the body mass index
*/
import  javax.swing.JOptionPane;

public class BMI{
public static void main(String[] args) {
    float weight, height;
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;

    weight= Float.parseFloat(JOptionPane.showInputDialog("enter your weight in pounds"));

    height= Float.parseFloat(JOptionPane.showInputDialog("enter your heiht in inches"));

    double weightInKILOGRAMS = weight * KILOGRAMS_PER_POUND;

    double heihtInMeters = height * METERS_PER_INCH;

    double bmi = weightInKILOGRAMS / (Math.pow(heihtInMeters,2));
    if (bmi < 16) {
      JOptionPane.showMessageDialog(null, "you  are seriously underweight");

    }else if (bmi < 18) {
      JOptionPane.showMessageDialog(null, "you are underweight");

    }else if (bmi < 24) {
      JOptionPane.showMessageDialog(null, "you are normal weight");

    }else if (bmi < 29) {
      JOptionPane.showMessageDialog(null, "you are overweight");

    }else if (bmi < 35) {
      JOptionPane.showMessageDialog(null, "you are seriously overweight");

    }else {
      JOptionPane.showMessageDialog(null, "you are gravely overweight");
    }
  }
}
