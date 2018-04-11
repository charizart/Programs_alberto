/*
alberto vega vega
PaymentToMonths.java
This program shows what a person will pay for a lon
*/
import javax.swing.JOptionPane;
public class PaymentToMonths{
  public static void main(String[]args){
    int i;
    float p=0;
    float t=0;
    p= 10;
    for (i=1;i<=20;i++){

      JOptionPane.showMessageDialog(null, "En el mes  "+ i +" pagaras "+p);
      t = t+p;
      p = p*2;
    }
      JOptionPane.showMessageDialog(null, "AL final de los 20 meses pagaras "+t);
  }
}
