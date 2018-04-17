/*********************************************
 MenuBMI.java
 Pedro uriel de jesus cortez
 este es un prototipo de menu para BMIOOP
 **********************************************/
import javax.swing.*;
 public class menuBMI{
   public static void main(String[] args){
do{
     BMIOOP person;

     person=new BMIOOP();

  final int opcion;
     opcion=Integer.parseInt(JOptionPane.showInputDialog("1-Name\n 2-Age\n 3-weight \n 4-height\n 5-calculate BMI\n 6-evaluate BMI\n 7-exit\n"));
     if(opcion == 1){
       String name;
       name=JOptionPane.showInputDialog("enter the name");
       JOptionPane.showMessageDialog(null, name);
     }else if(opcion ==2){
       int age;
       age=Integer.parseInt(JOptionPane.showInputDialog("enter the age" ));
       JOptionPane.showMessageDialog(null, age);
     }else if(opcion == 3){
       double weight;
       weight=Double.parseDouble(JOptionPane.showInputDialog("enther the weight"));
       JOptionPane.showMessageDialog(null, weight);
     }else if(opcion == 4){
       double height;
       height=Double.parseDouble(JOptionPane.showInputDialog("enther the height"));
       JOptionPane.showMessageDialog(null, height);
     }else if (opcion == 5){
       double height,weight;
       height=Double.parseDouble(JOptionPane.showInputDialog("enter the height"));
       weight=Double.parseDouble(JOptionPane.showInputDialog("enter the weight"));
       person.setHeight(height);
       person.setWeight(weight);
      JOptionPane.showMessageDialog(null, person.getBMI());
     }else if (opcion == 6){
       JOptionPane.showMessageDialog(null, person.getStatus());
     }
   }while (opcion ==7){

     JOptionPane.showMessageDialog(null, "adios");
}
}
     }
