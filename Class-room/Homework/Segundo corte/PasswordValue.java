import javax.swing.*;
public class PasswordValue{
public static void main(String[] args) {
  MethodPassword contra;
  contra = new MethodPassword();

  String password12;
  password12 =JOptionPane.showInputDialog("enter the password");
  contra.setPassword(password12);

  if (contra.getNum()>=5 && contra.getMinus()>=1 && contra.getMayus()>=2){
JOptionPane.showMessageDialog(null,"la contraseña es valida");
  }else
JOptionPane.showMessageDialog(null,"La contraseña es debil debe tener \n 1.--2 o mas letras mayusculas\n 2.--Mas de una letra minuscula\n 3.--5 o mas numeros\nIntentelo de nuevo");
}


}
