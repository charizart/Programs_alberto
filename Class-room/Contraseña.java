/*
alberto vega vega

Contraseña.java


*/

import java.util.Scanner;

public class Contraseña {

	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);
		int login=0;
		int pass=0;
		int intentos=1;
		int maximo=3;

				while((login!=1809)||(pass!=1234)&& (intentos<maximo)){

					System.out.print("introduzca un login: ");
					login=teclado.nextInt();
					System.out.print("Introduzca su pass:");
					pass=teclado.nextInt();

					if(intentos==3){
						System.out.println("acceso denegado..");
						intentos=intentos-maximo;
					}

					intentos++;

			}

			System.out.println("login y pass, correctos...");

	}

}
