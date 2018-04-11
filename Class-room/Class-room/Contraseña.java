/*
Alberto vega vega
contraseña.java

*/
public class Contraseña {

    private String Logitud;
    private String Contraseña;

    public Contraseña() {
    }

    public String getLogitud() {
        return Logitud;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setLogitud(String Logitud) {
        this.Logitud = Logitud;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public boolean Medir() {
        return Contraseña.length() >= 8;
    }
    int m = 0;
    int y = 0;
    int num = 0;

    public boolean isStrong() {
        for (int i = 0; i <= Contraseña.length()-1; i++) {
            boolean p = Character.isUpperCase(Contraseña.charAt(i));
            if (p == true) {
                y = y + 1;
            } else {

            }
        }
        for (int i = 0; i <= Contraseña.length()-1; i++) {
            boolean p = Character.isLowerCase(Contraseña.charAt(i));
            if (p == true) {
                m = m + 1;
            } else {

            }
        }
        for (int i = 0; i <= Contraseña.length()-1; i++) {
              try{
                  Integer.parseInt(Contraseña.substring(i, i+1));
                  num = num + 1;
                  System.out.println(num);
              }catch(Exception e){
              }

        }


        if (Medir() == true) {
            if (y >= 2) {
                if (m >= 1) {
                        if(num >= 5){
                            return true;
                        }else{
                            return false;
                        }
                } else {
                   return false;

                }
            } else {
                return false;

            }



        } else {
           return false;
        }

    }
}
