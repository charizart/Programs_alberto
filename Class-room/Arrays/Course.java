/*
alberto vega vega
Class: Course.java

*/
import javax.swing.*;
public class Course {
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents= 0;

//constructor
  public Course(String courseName) {
    this.courseName = courseName;
  }

//methods to get the name of course
  public String getNameCourse(){
    return this.courseName;
  }

//adds a new student to the course
  public void addStudent(String student) {
    students[numberOfStudents] = student;
    numberOfStudents ++;
  }

//return the students for the course
  public String[] getStudents() {
    return this.students;
  }

//returns the number of the students for the course
  public int getNumberOfStudents() {
    return this.numberOfStudents;
  }

  public static void main(String[] args) {

    Course programacion = new Course("programacion");
    int opc = Integer.parseInt(JOptionPane.showInputDialog("....MENU.......\n 1- Create course \n2- Add student \n3- Show students \n4- Drop student \n"));
    do {
      switch (opc) {
        case 1:
          String course = JOptionPane.showInputDialog("Course name?");
          break;
        case 2:
          String nameStudent = JOptionPane.showInputDialog("Student name?");
          programacion.addStudent(nameStudent);
          break;
        case 3:
          String[] students = programacion.getStudents();
          String output = "";
          for (int i = 0; i < programacion.getNumberOfStudents(); i++ ) {
            output += "Student " + (i + 1) + " " + students[i] + "\n";
          }
          JOptionPane.showMessageDialog(null, output);
          break;
        case 4:
          nameStudent = JOptionPane.showInputDialog("Student´s name?");
          programacion.dropStudent(nameStudent);
          JOptionPane.showMessageDialog(null, "The student was deleted");
          break;
        case 5:
          JOptionPane.showMessageDialog(null, "BYE");
        default:
          JOptionPane.showMessageDialog(null, "Opcion no valida");
      }
    } while(opc != 5);
  }

  public void dropStudent(String student) {
    for (int i = 0; i < this.numberOfStudents; i++ ) {
      if (students[i].equalsIgnoreCase(student)) {
        this.students[i] = null;
      }
    }
  }
}
