/*
Alberto vega vega



*/

import javax.swing.*;
public class PersonObject{
  public static void main(String[] args) {
   Person person=new Person();
   JOptionPane.showMessageDialog(null,"the name is "+person.getName()+"\n the age is "+person.getAge()+"\n the gender is "+person.getGender()+"\n "+person.getDNI()+"\n the BMI is:"+person.getStatusBMI()+"\n"+person.getGen());

   Person person2=new Person();
   String name2=JOptionPane.showInputDialog("enter the name");
   person2.setName(name2);
   Double age2=Double.parseDouble(JOptionPane.showInputDialog("enter the age"));
   person2.setAge(age2);
   String gender2=JOptionPane.showInputDialog("enter the gender");
   person2.setGender(gender2);
   JOptionPane.showMessageDialog(null,"the name is "+person2.getName()+"\n the age is "+person2.getAge()+"\n the gender is "+person2.getGender()+"\n "+person2.getDNI()+"\n"+person2.getGen());

   Person person3=new Person();
   String name3=JOptionPane.showInputDialog("enter the name");
   person3.setName(name3);
   double age3=Double.parseDouble(JOptionPane.showInputDialog("enter the age"));
   person3.setAge(age3);
   String gender3=JOptionPane.showInputDialog("enter the gender");
   person3.setGender(gender3);
   double height3=Double.parseDouble(JOptionPane.showInputDialog("enter the height"));
   person3.setHeight(height3);
   double weigth3=Double.parseDouble(JOptionPane.showInputDialog("enter the weight"));
   person3.setWeigth(weigth3);
   JOptionPane.showMessageDialog(null,"the name is "+person3.getName()+"\n the age is "+person3.getAge()+"\n the gender is "+person3.getGender()+"\n "+person3.getDNI()+"\n the BMI is:"+person3.getStatusBMI()+"\n"+person3.getGen());
  }
}
