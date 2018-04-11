/*
alberto vea vega
TikiTaka.java
This program calculates how many tepes of sales there were in one day and shows the result in the screen
*/
import javax.swing.JOptionPane;
public class TikiTaka{
  public static void main(String[]args){
    float n;
    float cn=1;
    int a=0;
    int b=0;
    int c=0;
    float v;
    float t1=0;
    float t2=0;
    float t3=0;
    float tt;
    n=Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of customers you had today"));
    do{
      v=Float.parseFloat(JOptionPane.showInputDialog("How much you paid in the sale number " + cn));
      if (v>=1000){
        a++;
        t1=t1+v;
      }
      else if (v>=500 && v<1000){
        b++;
        t2=t2+v;
      }
      else if (v<=500){
        c++;
        t3=t3+v;
      }
    cn=cn+1;
  }while (cn<n+1);
  JOptionPane.showMessageDialog(null, "Today, you had " + a + " type A purchases and the total collected for them was $" + t1 +"\nToday, you had " + b + " type B purchases and the total collected for them was $" + t2 + "\nToday, you had " + c + " type C purchases and the total collected for them was $" + t3);
  }
}
