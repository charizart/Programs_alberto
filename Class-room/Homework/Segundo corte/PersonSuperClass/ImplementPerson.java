import javax.swing.*;
public class ImplementPerson{
  public static void main(String[] args) {
    Student student=new Student("pedro","1 norte","tic´s",19,1000);
    JOptionPane.showMessageDialog(null,student.toString());
    Staff staff=new Staff("pedro","1 norte","UTT",1000);
    JOptionPane.showMessageDialog(null,staff.toString());
  }
}
