/*
alberto vega
sueldo.java
ejercicio 32
*/



import javax.swing.JOptionPane;
public class sueldo{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Programa que calcula el sueldo de un empleado");
        String empleado;
        int diast,horasextra,importe=0,bono=0,descuento=0,sueldo=0;
        double sueldoiva=0,iva=1.11;
        empleado = JOptionPane.showInputDialog("Empleado:");
        diast = Integer.parseInt(JOptionPane.showInputDialog("Dias Trabajados:"));
        horasextra = Integer.parseInt(JOptionPane.showInputDialog("Horas extras:"));
        if(tipoe==1){
            importe=350*diast;
        }
        if(tipoe==2){
            importe=250*diast;
        }
        if(tipoe==3){
            importe=125*diast;
        }
        if(horasextra>=1 && horasextra<=5){
            bono=horasextra*100;
        }
        if(horasextra>=6 && horasextra<=10){
            bono=500+((horasextra-5)*150);
        }
        if(horasextra>=11 && horasextra<=15){
            bono=1250+((horasextra-10)*275);
        }

        sueldo=(importe+bono)-descuento;
        sueldoiva=sueldo*iva;
        String imprimir="";
        imprimir=imprimir+("Empleado:"+empleado+"\n");
        imprimir=imprimir+("Dias Trabajados:"+diast+"\n");
        imprimir=imprimir+("Horas Extras:"+horasextra+"\n");
        imprimir=imprimir+("Importe:"+importe+"\n");
        imprimir=imprimir+("Bono:"+bono+"\n");
        imprimir=imprimir+("Descuento:"+descuento+"\n");
        imprimir=imprimir+("Sueldo:"+sueldo+"\n");
        imprimir=imprimir+("Sueldo con IVA:"+sueldoiva+"\n");
        JOptionPane.showMessageDialog(null, imprimir," Nomina: ",1);
    }
}
