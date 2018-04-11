/************
alberto vega vega
Triangulo.java
the programs gives us the area of a triangle
************/
import java.util.Scanner;
public class Triangulo {
     public static void main(String[] args) {
        int b;
        int h;
        int area;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa base");
        b=sc.nextDouble();
        System.out.println("Ingresa altura");
        h=sc.nextDouble();
        area=(b*h)/2;
       System.out.print("El area es de: " + area);
     }
}
