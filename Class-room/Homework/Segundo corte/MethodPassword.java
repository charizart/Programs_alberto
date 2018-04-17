/*******************************************************************************
Alberto vega vega
password1.java

this class this class verifies the password that is entered
*******************************************************************************/
import javax.swing.*;
public class MethodPassword{
  private String password;

  public void setPassword(String password){
    this.password=password;
         }
  public String getPassword(){
           return this.password;
         }
         //calcular las mayusculas
  public double getMayus(){
    String password = this.password;
         char clave;
         int contNumero = 0, contLetraMay = 0, contLetraMin=0;
         for (byte i = 0; i < password.length(); i++) {
                  clave = password.charAt(i);
                 String passValue = String.valueOf(clave);
                  if (passValue.matches("[A-Z]")) {
                      contLetraMay++;
                  } else if (passValue.matches("[a-z]")) {
                      contLetraMin++;
                  } else if (passValue.matches("[0-9]")) {
                      contNumero++;
                  }
          }return contLetraMay;
  }//termina getMayus


  //get Minus
  public double getMinus(){
    String password = this.password;
       char clave;
       int  contNumero = 0, contLetraMay = 0, contLetraMin=0;
       for (byte i = 0; i < password.length(); i++) {
                clave = password.charAt(i);
               String passValue = String.valueOf(clave);
                if (passValue.matches("[A-Z]")) {
                    contLetraMay++;
                } else if (passValue.matches("[a-z]")) {
                    contLetraMin++;
                } else if (passValue.matches("[0-9]")) {
                    contNumero++;
                }

        }return contLetraMin;
  }//end getMinus
  public double getNum(){
    String password = this.password;
       char clave;
       int  contNumero = 0, contLetraMay = 0, contLetraMin=0;
       for (byte i = 0; i < password.length(); i++) {
                clave = password.charAt(i);
               String passValue = String.valueOf(clave);
                if (passValue.matches("[A-Z]")) {
                    contLetraMay++;
                } else if (passValue.matches("[a-z]")) {
                    contLetraMin++;
                } else if (passValue.matches("[0-9]")) {
                    contNumero++;
                }
        }return contNumero;
  }


}
